/** 
 * Project Name:double-datasources 
 * File Name:UserServiceImpl.java 
 * Package Name:com.seed.app.service.impl 
 * Date:2018年1月18日下午3:43:46 
 * Copyright (c) 2018,  All Rights Reserved. 
 * 
* 　　　　　　　　┏┓　　　┏┓
 * 　　　　　　　┏┛┻━━━┛┻┓
 * 　　　　　　　┃　　　　　　　┃ 　
 * 　　　　　　　┃　　　━　　　┃
 * 　　　　　　　┃　＞　　　＜　┃
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃...　⌒　... ┃
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃　　　　　　　　　　
 * 　　　　　　　　　┃　　　┃   神兽无影，BUG无踪！
 * 　　　　　　　　　┃　　　┃　　　　　　　　　　　
 * 　　　　　　　　　┃　　　┃  　　　　　　
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　　　　　　　　　　
 * 　　　　　　　　　┃　　　┗━━━┓
 * 　　　　　　　　　┃　　　　　　　┣┓
 * 　　　　　　　　　┃　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛
*
*
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽无影，BUG无踪！
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 *
 * ━━━━━━感觉萌萌哒━━━━━━
*/ 
package com.seed.app.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.app.dao.UserDao;
import com.seed.app.service.UserService;

/** 
 * ClassName:UserServiceImpl
 * Date:     2018年1月18日 下午3:43:46 
 * DESC:	
 * @author   lwd 
 * @version   
 * @since    JDK 1.7
 * @see       
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public void selectUserNameById(String id) {
		String userName;
		try {
			userName = userDao.selectUserNameById(id);
			System.out.println("userName ===>>> " + userName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void queryUserNameByUid(String uid) {
		// TODO Auto-generated method stub
		String userName ;
		try {
			userName = userDao.queryUserNameByUid(uid);
			System.out.println(" userName >>>===>>> " + userName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
