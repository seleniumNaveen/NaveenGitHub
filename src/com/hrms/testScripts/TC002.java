package com.hrms.testScripts;

import com.hrms.lib.Genaral;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC002 {
//public static void main(String[] args) throws Exception {
	@Test
	public void tc002() throws Exception	{
		   DOMConfigurator.configure("log4j.xml");
	Genaral g=new Genaral();
	g.openApp();
	g.login();
	g.addemp();
	g.logout();
	g.closeApp();
}
}
