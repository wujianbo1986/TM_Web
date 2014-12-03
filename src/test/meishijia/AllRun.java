package test.meishijia;

import test.meishijia.base.UserInfoString;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllRun {

	public static Test suite()  {
		// IOExcel ioExcel = new IOExcel();
		// ioExcel.addTitle(UserData.filePath, UserData.fileName, 2, 0,
		// UserData.titleStrings[2]);
		// ioExcel.addTitle(UserData.filePath, UserData.fileName, 3, 0,
		// UserData.titleStrings[3]);
		UserInfoString ui = new UserInfoString();
		TestSuite suite = new TestSuite();
		for (int i = 0; i < ui.userName.length - 1; i++) {

			suite.addTest(TestSuite.createTest(Test_Login.class, "testFirefox"));
		}

		return suite;
	}
}
