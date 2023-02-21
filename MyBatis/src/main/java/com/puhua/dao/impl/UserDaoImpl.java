package com.puhua.dao.impl;

import com.puhua.dao.IUserDao;
import com.puhua.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }

    public List<User> findAll() {
        SqlSession session=factory.openSession();
        List<User> users = session.selectList("com.puhua.dao.IUserDao.findAll");
        return users;
    }
}
