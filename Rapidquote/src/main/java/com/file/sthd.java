/*
 * package com.file;
 * 
 * import java.util.Properties;
 * 
 * import javax.mail.BodyPart; import javax.mail.Message; import
 * javax.mail.MessagingException; import javax.mail.PasswordAuthentication;
 * import javax.mail.Session; import javax.mail.Transport; import
 * javax.mail.internet.InternetAddress; import javax.mail.internet.MimeBodyPart;
 * import javax.mail.internet.MimeMessage; import
 * javax.mail.internet.MimeMultipart;
 * 
 * public class sthd { public static void main(String[] args) { Properties props
 * = new Properties(); props.put("mail.smtp.host", "smtp.gmail.com");
 * props.put("mail.smtp.socketFactory.port", "465");
 * props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 * props.put("mail.smtp.auth", "true"); props.put("mail.smtp.port", "465");
 * 
 * Session session = Session.getDefaultInstance(props, new
 * javax.mail.Authenticator() { protected PasswordAuthentication
 * getPasswordAuthentication() { return new
 * PasswordAuthentication("gaikwadpooja269@gmail.com", "suman@9657"); } });
 * 
 * try {
 * 
 * Message message = new MimeMessage(session); message.setFrom(new
 * InternetAddress("gaikwadpooja269@gmail.com"));
 * message.setRecipients(Message.RecipientType.TO,
 * InternetAddress.parse("gaikwadpooja269@gmail.com"));
 * message.setSubject("Testing Subject"); message.setText("Dear Mail Crawler," +
 * "\n\n No spam to my email, please!");
 * 
 * MimeMultipart multipart = new MimeMultipart("related"); BodyPart
 * messageBodyPart = new MimeBodyPart(); messageBodyPart = new MimeBodyPart();
 * messageBodyPart.setContent("<html>\r\n" + "<body>\r\n" +
 * "<h1>			<img src=\"cid:image\">      Ace Express Delivery</h1>\r\n"
 * + "<hr>\r\n" + emailContent + "</body>\r\n" + "</html>", "text/html");
 * 
 * multipart.addBodyPart(messageBodyPart); messageBodyPart = new MimeBodyPart();
 * messageBodyPart.attachFile( loader.getResource(
 * "/EcalpAdmin/resources/imgecalcp/fondoencabezado_marron.png").getFile());
 * messageBodyPart.setHeader("Content-ID", "<image>");
 * multipart.addBodyPart(messageBodyPart);
 * 
 * Transport.send(message);
 * 
 * System.out.println("Done");
 * 
 * } catch (MessagingException e) { throw new RuntimeException(e); } } }
 */