package chapter3.ch13.domain.userinfo.dao.oracle;

import chapter3.ch13.domain.userinfo.UserInfo;
import chapter3.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into oracle db userId = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("insert into oracle db userId = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("insert into oracle db userId = " + userInfo.getUserId());
	}

}
