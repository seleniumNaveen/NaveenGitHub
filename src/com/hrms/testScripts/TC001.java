package com.hrms.testScripts;

import com.hrms.lib.Genaral;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

   public class TC001 {
   //public static void main(String[] args) throws Exception {	
   @Test
   public void Tscripts() throws Exception{
	   DOMConfigurator.configure("log4j.xml");
	Genaral obj=new Genaral();
	obj.openApp();
	obj.login();
	obj.logout();
	obj.closeApp();
}

}