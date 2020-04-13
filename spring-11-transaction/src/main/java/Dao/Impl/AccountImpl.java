package Dao.Impl;

import Dao.IAccountDao;
import org.mybatis.spring.SqlSessionTemplate;
import pojo.Account;

import java.util.List;

/**
 * @author YZY
 * @date 2020/4/12 - 17:43
 */
public class AccountImpl implements IAccountDao {


    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public void tx(int id, Account account){
        addAccount(account);
        deleteAccount(id);
    }

    @Override
    public Account findByName(int id) {
        IAccountDao iAccountDao = sqlSessionTemplate.getMapper(IAccountDao.class);
        return iAccountDao.findByName(id);
    }

    @Override
    public int addAccount(Account account) {
        IAccountDao iAccountDao = sqlSessionTemplate.getMapper(IAccountDao.class);
        return iAccountDao.addAccount(account);
    }

    @Override
    public int deleteAccount(int id) {
        IAccountDao iAccountDao = sqlSessionTemplate.getMapper(IAccountDao.class);
        return iAccountDao.deleteAccount(id);
    }
}
