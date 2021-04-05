package chapter3.ch13.domain.userinfo.dao.mysql;

import chapter3.ch13.domain.userinfo.UserInfo;
import chapter3.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into mysql db userId = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into mysql db userId = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from mysql db userId = " + userInfo.getUserId());
		
	}

}
