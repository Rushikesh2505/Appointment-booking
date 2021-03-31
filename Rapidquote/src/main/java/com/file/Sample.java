package com.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
	public static void main(String[] args) throws IOException {
		String[] cmd = new String[2];
		cmd[0] = "C:\\Python27\\python.exe"; // check version of installed python: python -V
		cmd[1] = "C:\\apache-tomcat-9.0.12\\Rapidquote_FS\\partFiles\\1027_3_HALF_SPHERE2019_03_20_16_49_38.py";	
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		System.out.println("pr:" + pr);
		BufferedReader bfr1 = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
		String Error = bfr1.readLine();
		System.out.println("Error:" + Error);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String outputPython;
		String output = "";
		while ((outputPython = bfr.readLine()) != null) {
			output = outputPython;
		}
		System.out.println("OUTPUT:" + output);
	}
}
