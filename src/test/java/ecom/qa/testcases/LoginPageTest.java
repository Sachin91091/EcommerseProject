package ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import ecom.qa.pages.LoginPage;

import ecom.qa.util.TestUtil;

import ecom.qa.base.TestBase;
import ecom.qa.pages.*;


public class LoginPageTest  extends TestBase{
	LoginPage loginPage;
	HomePage	homePage;
	
	public LoginPageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

}
