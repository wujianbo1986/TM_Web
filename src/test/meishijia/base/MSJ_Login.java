package test.meishijia.base;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MSJ_Login {
	public String urlHomePage = "http://www.meishijia.com/";
	public String urlLogin = "http://www.meishijia.com/member/login";
	public String urlSign = "http://www.meishijia.com/member/myhome";
	// LoginInfo info = new LoginInfo();
	UserInfoString ui = new UserInfoString();

	public void msj_login(FirefoxDriver driver) throws InterruptedException {
		UserInfoString.numel++;
		// System.err
		// .println("UserInfoString.numel++   ==" + UserInfoString.numel);
		// UserData uri = new UserData();
		// IOExcel ioExcel = new IOExcel();

		driver.get(urlLogin);
		 Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[3]/div/div/div[2]/div/div[5]/input"))
				.sendKeys(ui.userName[ui.numel - 1]);
		// .sendKeys(
		// ioExcel.excelOutput(UserData.filePath,
		// UserData.outFileName, uri.cloum(), uri.userRow));
		driver.findElement(
				By.xpath("/html/body/div[3]/div/div/div[2]/div/div[6]/input"))
				.sendKeys(ui.userPassWord[ui.numel - 1]);
		// .sendKeys(
		// ioExcel.excelOutput(UserData.filePath,
		// UserData.outFileName, uri.cloum() + 1,
		// uri.userRow));

		if (driver
				.findElement(
						By.xpath("/html/body/div[3]/div/div/div[2]/div/div[9]/div/div/span"))
				.isDisplayed()) {

			for (int i = 0; i < 5; i++) {
				if (driver.getTitle().equalsIgnoreCase("用户登录-美食家")) {
					driver.findElement(
							By.xpath("/html/body/div[3]/div/div/div[2]/div/div[9]/div/div/span"))
							.click();
					// System.err.println("Xpath(登录)有效点击次数--" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		} else {
			System.err.println("Xpath无效");
			if (driver.findElement(By.className("ymui_btn_content"))
					.isEnabled()) {
				driver.findElement(By.className("ymui_btn_content")).click();
			} else if (driver.findElement(
					By.className("g-comp-btn-txt ymui_btn_content"))
					.isEnabled()) {
				driver.findElement(
						By.className("g-comp-btn-txt ymui_btn_content"))
						.click();
			} else {
				driver.findElement(By.linkText("登录")).click();
				System.err.println("点击文本");
			}

		}
		System.out.println(ui.userName[ui.numel - 1] + "---login");
		// Thread.sleep(1000);
		// System.out.println(driver.getTitle());
	}

	public void msj_sign(FirefoxDriver driver) throws InterruptedException {
		driver.get(urlSign);
		// System.err.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/div[1]/div[4]/a"))
				.click();
		Thread.sleep(1000);
		System.out
				.println(driver.findElement(
						By.xpath("/html/body/div[1]/div/div[1]/span"))
						.getText()
						+ "----连续签到"
						+ driver.findElement(
								By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/div[1]/div[4]/a"))
								.getText());
		
	}
}
