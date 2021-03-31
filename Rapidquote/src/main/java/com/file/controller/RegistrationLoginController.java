package com.file.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.file.beans.UserBean;
import com.file.service.UserService;

@Controller
public class RegistrationLoginController {


	@Autowired
	UserService userService;

	@Autowired
	private MessageSource messages;

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	private final Logger LOGGER = Logger.getLogger(getClass());
	/**
	 * @param Materiabean This method adds a MATERIAL in MATERIAL Table
	 */
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public @ResponseBody String addMaterial(HttpServletRequest request, @ModelAttribute("userBean") UserBean userBean) {

		String directory = request.getServletContext().getAttribute("FILESIMG_DIR") + File.separator;
		//String path = directory + orderNo + ".pdf";
		if (userBean.getReport() != null) {

			File file = new File(directory +Math.random()+ userBean.getReport().getOriginalFilename());
	String sss=file.getName();
			if (file.exists()) {
				return "reportFaild";
			} else
				try {

					IOUtils.copy(userBean.getReport().getInputStream(), new FileOutputStream(file));

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			userBean.setImageFile(userBean.getReport().getOriginalFilename());
		}
		if (userService.addUser(userBean) != null)
			return "saved";
		else
			return "failed";
	}

	/*
	 * @RequestMapping(value = "/registrationConfirm/{token}", method =
	 * RequestMethod.GET) public ModelAndView confirmRegistration(final
	 * HttpServletRequest request, final Model model,
	 * 
	 * @PathVariable(value = "token") final String token) { Locale locale =
	 * request.getLocale(); final String result =
	 * userService.validateVerificationToken(token); if (result.equals("valid")) {
	 * model.addAttribute("message", "Your account verified successfully"); } //
	 * model.addAttribute("message", messages.getMessage("auth.message." + result,
	 * // null, locale)); model.addAttribute("expired", "expired".equals(result));
	 * model.addAttribute("token", token);
	 * 
	 * return new ModelAndView("uploadFile"); }
	 */
	/*
	 * @RequestMapping(value = "/user/resendRegistrationToken", method =
	 * RequestMethod.GET)
	 * 
	 * @ResponseBody public GenericResponse resendRegistrationToken(final
	 * HttpServletRequest request,
	 * 
	 * @RequestParam("token") final String existingToken) { final VerificationToken
	 * newToken = userService.generateNewVerificationToken(existingToken); final
	 * UserBean user = userService.getUserByToken(newToken.getToken());
	 * //constructResendVerificationTokenEmail(getAppUrl(request),
	 * request.getLocale(), newToken, user); return new
	 * GenericResponse(messages.getMessage("message.resendToken", null,
	 * request.getLocale())); }
	 */

	/*
	 * @RequestMapping(value = "/user/authenticate", method = RequestMethod.GET)
	 * public @ResponseBody JsonResponse userLogin(HttpServletRequest
	 * request, @RequestParam("username") String username,
	 * 
	 * @RequestParam("password") String password, HttpSession httpSession) {
	 * SessionLocaleResolver resolver = (SessionLocaleResolver) request
	 * .getAttribute(DispatcherServlet.LOCALE_RESOLVER_ATTRIBUTE);
	 * 
	 * if (userService.emailExists(username)) { UserBean userBean =
	 * userService.getUser(username);
	 * 
	 * if (userBean.getEnabled() == true) { String pass =
	 * PasswordUtils.decrypt(userBean.getPassword()); if
	 * (!pass.equalsIgnoreCase(password)) { return new
	 * JsonResponse("Password Invalid", "Please check your password"); } else {
	 * userService.updateLoggedUsers(userBean);
	 * 
	 * Object cart = customerService.checkCart(userBean.getUserId());
	 * userBean.setCartNo(String.valueOf(cart)); httpSession.setAttribute("user",
	 * userBean); JSONObject obj = new JSONObject(); obj.put("message",
	 * "Logged in successfully"); obj.put("userId", userBean.getUserId());
	 * obj.put("firstName", userBean.getFirstName()); obj.put("lastName",
	 * userBean.getLastName()); obj.put("cartNo", userBean.getCartNo());
	 * StringWriter out = new StringWriter(); try { obj.writeJSONString(out); }
	 * catch (IOException e) { e.printStackTrace(); return new
	 * JsonResponse("Login Failed", "Please try signing in again"); } String
	 * jsonText = out.toString(); return new JsonResponse("Login Success",
	 * jsonText); }
	 * 
	 * } else { return new JsonResponse("User Not Verified",
	 * "You don't have a verified email address with Rapidquote"); }
	 * 
	 * } else { return new JsonResponse("User Doesnt Exist",
	 * "Please sign up to create a Rapidquote Account"); }
	 * 
	 * }
	 */
	// will get the email and check whether it exists in the db or not. if yes then
	// returns user
	// create token
	// create token for user
	// send mail to the user with id and token
	/*
	 * @RequestMapping(value = "/user/forgotPassword", method = RequestMethod.GET)
	 * public @ResponseBody JsonResponse resetRequest(HttpServletRequest request,
	 * 
	 * @RequestParam(value = "email") String email) { User user =
	 * userService.getUserEntity(email); if (user != null) { final String token =
	 * UUID.randomUUID().toString();
	 * userService.createPasswordResetTokenForUser(user, token);
	 * Email.sendEmail(email, "Reset Password using the provided link.",
	 * EmailTemplate.createMessage(getAppUrl(request), request, user, token));
	 * System.out.println("mail sent"); return new JsonResponse("result",
	 * " Login to your registered email address to reset password"); } else { return
	 * new JsonResponse("result", "Non registered Email"); } }
	 */
	/*
	 * @RequestMapping(value = "/user/changePassword/{id}/{token}", method =
	 * RequestMethod.GET) public String showChangePasswordPage(final Locale locale,
	 * final Model model,
	 * 
	 * @PathVariable(value = "id") final long id, @PathVariable(value = "token")
	 * final String token) { final String result =
	 * userService.validatePasswordResetToken(id, token); String email =
	 * userService.getUserById(Long.valueOf(id)).getContactEmail(); if (result !=
	 * null) { model.addAttribute("msg", result); return "error"; }
	 * model.addAttribute("email", email); return "newPassword"; }
	 * 
	 * @RequestMapping(value = "/user/savePassword", method = RequestMethod.POST)
	 * public @ResponseBody JsonResponse resetPassword(@RequestBody PasswordBean
	 * passwordBean) throws Exception { //
	 * System.out.println("in reset password controller"); UserBean userBean =
	 * userService.getUser(passwordBean.getEmail());
	 * userBean.setPassword(PasswordUtils.encrypt(passwordBean.getNewPassword()));
	 * userService.updateUser(userBean); return new JsonResponse("result",
	 * "success"); }
	 * 
	 * @RequestMapping(value = "/user/logout", method = RequestMethod.GET) public
	 * ModelAndView userLogOut(HttpSession session, HttpServletRequest request) {
	 * UploadController.listQuoteBeans.clear(); session.invalidate(); return new
	 * ModelAndView("uploadFile"); }
	 * 
	 * @RequestMapping(value = "/user/profile", method = RequestMethod.GET) public
	 * ModelAndView profile(ModelMap model, @RequestParam("userId") Long userId) {
	 * UserBean userBean = userService.getUserById(userId);
	 * model.addAttribute("bean",userBean); return new ModelAndView("profile"); }
	 * 
	 * 
	 * @RequestMapping(value = "/user/profile", method = RequestMethod.GET) public
	 * ModelAndView getSingleMaterial(ModelMap model,
	 * 
	 * @RequestParam(value = "userId", required = false) String userId) { UserBean
	 * bean = userService.getUserById(Long.parseLong(userId));
	 * model.addAttribute("bean", bean); return new ModelAndView("pv_profile");
	 * 
	 * }
	 * 
	 */ private String getAppUrl(HttpServletRequest request) {
		return "https://" + request.getServerName() + request.getContextPath();
	}

	/*
	 * private String getAppUrl(HttpServletRequest request) { return "http://" +
	 * request.getServerName() + ":" + request.getServerPort() +
	 * request.getContextPath(); }
	 */

}
