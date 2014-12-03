package test.meishijia;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.meishijia.base.MSJ_Login;
import test.meishijia.base.UserInfoString;

public class Test_Login extends TestCase {

	FirefoxDriver driver;
	MSJ_Login login = new MSJ_Login();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		System.err.println("start---");
	}

	@After
	public void tearDown() {
		driver.quit();
		System.err.println("over---" + UserInfoString.numel);

	}

	@Test
	public void testFirefox() throws InterruptedException {

		login.msj_login(driver);
		login.msj_sign(driver);
	}
}