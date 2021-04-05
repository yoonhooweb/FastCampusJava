package chapter3.ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import chapter3.ch13.domain.userinfo.UserInfo;
import chapter3.ch13.domain.userinfo.dao.UserInfoDao;
import chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream files = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(files);
		
		String type = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("123");
		userInfo.setUserName("조윤후");
		
		UserInfoDao userInfoDao = null;
		
		if (type.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} 
		else if(type.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		} else {
			System.out.println("지원하는 버전이 없습니다.");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
