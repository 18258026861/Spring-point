package Dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

/**
 * @author YZY
 * @date 2020/4/12 - 17:52
 */
public class test {
    @Test
    public void findbyname(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        IAccountDao accountimpl = applicationContext.getBean("accountimpl", IAccountDao.class);
        System.out.println(accountimpl.findByName(1));
    }
    @Test
    public void add(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        IAccountDao accountimpl = applicationContext.getBean("accountimpl", IAccountDao.class);
        Account account = new Account(215, "yy", 1);
        System.out.println(accountimpl.addAccount(account));
    }
    @Test
    public void delete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        IAccountDao accountimpl = applicationContext.getBean("accountimpl", IAccountDao.class);
        System.out.println(accountimpl.deleteAccount(210));
    }

    @Test
    public void tx(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        IAccountDao accountimpl = applicationContext.getBean("accountimpl", IAccountDao.class);
        Account account = new Account(215, "yy", 1);
        accountimpl.tx(215,account);
    }

}
