/*package cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reading_Cyclos_data {
	Properties pro;
	public  Reading_Cyclos_data() {
		File fl = new File("D:\\Java\\Cyclos.01\\Input\\Data.properties");
		try {
			FileInputStream fis = new FileInputStream(fl);
			pro = new Properties();
			pro.load(fis);
		}
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}
		public String getFirstName() {
			String FName = pro.getProperty("FirstName");
			return FName;
		}
	
		public String getLoginName() {
			String LoginName = pro.getProperty("LoginName");
			return LoginName;
		}
		
		public String getEmailAddress() {
			String EmailAdd = pro.getProperty("Email");
			return EmailAdd;
		}
		public String getpassword() {
			String password = pro.getProperty("password");
			return password;
		}
		
		public String getconfirmpassword() {
			String CPassword = pro.getProperty("confirmpassword");
			return CPassword;
		}


}*/
