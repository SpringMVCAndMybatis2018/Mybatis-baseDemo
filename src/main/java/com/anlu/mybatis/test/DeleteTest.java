package com.anlu.mybatis.test;


import com.anlu.mybatis.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class DeleteTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 删除id为1的User对象
		session.delete("com.anlu.mybatis.mapper.UserMapper.removeUser", 1);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
