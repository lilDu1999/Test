package com.atdjj.service.impl;

import com.atdjj.domain.Account;
import com.atdjj.mapper.AccountMapper;
import com.atdjj.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl  implements AccountService {
    @Autowired
    private AccountMapper accountMapper;


    @Override
    public void save(Account account) {
//        //获得核心配置文件
//        InputStream resourceAsStream = null;
//        try {
//            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            //获得session工厂对象
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            //获得session回话对象
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            mapper.save(account);
//            sqlSession.commit();
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        accountMapper.save(account);



    }

    @Override
    public List<Account> findAll() {
//        //获得核心配置文件
//        InputStream resourceAsStream = null;
//        List<Account> accountList=null;
//        try {
//            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            //获得session工厂对象
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            //获得session回话对象
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            accountList = mapper.findAll();
//
//            sqlSession.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return accountList;
          return accountMapper.findAll();
    }
}
