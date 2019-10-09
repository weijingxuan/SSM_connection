package com.jingxuan.test;

import com.jingxuan.dao.AccountDao;
import com.jingxuan.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao=session.getMapper(AccountDao.class);
        //查询所有的账户信息
        List<Account> daoAll = dao.findAll();
        for(Account daoall:daoAll){
            System.out.println(daoall);
        }
        session.close();
        in.close();

    }

    @Test
    public void run2() throws Exception {
        Account account=new Account();
        account.setName("二狗");
        account.setMoney(100d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao=session.getMapper(AccountDao.class);
        dao.saveAccount(account);
        session.commit();
        session.close();
        in.close();

    }
}
