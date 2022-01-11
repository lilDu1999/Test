package com.atdjj.test;

import com.atdjj.dao.UserDao;
import com.atdjj.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void test() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.findAll();
        System.out.println(userList);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void test5() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> id = mapper.findById(new User(0, null, "123456", null, null));
        System.out.println(id);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        //模拟user对象
        User user = new User(0,"杜俊杰","123456","湖南省张家界市","18867277700");


        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        sqlSession.insert("userMapper.save",user);

        //mybatis执行更新操作  提交事务
        //sqlSession.commit();

        //释放资源
        sqlSession.close();
    }

    @Test
    public void test3() throws IOException {
        //模拟user对象
        User user = new User(7,"杜俊杰","123456","湖南省张家界市","15367686168");


        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        sqlSession.update( "userMapper.update",user);

        //mybatis执行更新操作  提交事务
        //sqlSession.commit();

        //释放资源
        sqlSession.close();
    }

    @Test
    public void test4() throws IOException {
        //模拟user对象
        User user = new User(11,"杜俊杰","123456","湖南省张家界市","15367686169");


        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        sqlSession.delete( "userMapper.delete",user);

        //mybatis执行更新操作  提交事务
        //sqlSession.commit();

        //释放资源
        sqlSession.close();
    }
}
