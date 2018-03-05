package com.anlu.mybatis.test;

import com.anlu.mybatis.factory.FKSqlSessionFactory;
import com.anlu.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;


public class UpadeTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 根据id查询User对象
		User user = session.selectOne("com.anlu.mybatis.mapper.UserMapper.selectUser",1);
		// 修改User对象的属性值
		user.setName("tom");
		user.setAge(25);
		// 修改User对象
		session.update("com.anlu.mybatis.mapper.UserMapper.modifyUser", user);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
