package Dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

import java.util.List;
import java.util.Map;

/**
 * @author YZY
 * @date 2020/4/12 - 15:33
 */
public class test {

    private IAccountDao iAccountDao;
    private Map map;
    private List<Account> accounts;


    @Test
    public void findall(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        IAccountDao iAccountDao = applicationContext.getBean("AccountImpl",IAccountDao.class);
        List<Account> accounts = iAccountDao.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
    }
}
