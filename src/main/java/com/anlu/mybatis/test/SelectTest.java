package com.anlu.mybatis.test;

import com.anlu.mybatis.factory.FKSqlSessionFactory;
import com.anlu.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;


public class SelectTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 根据id查询User对象
		User user = session.selectOne("com.anlu.mybatis.mapper.UserMapper.selectUser",1);
		System.out.println(user);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
