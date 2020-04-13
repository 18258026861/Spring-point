package Dao.Impl;

import Dao.IAccountDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.Account;

import java.util.List;

/**
 * @author YZY
 * @date 2020/4/12 - 16:27
 */
public class AccountDaoImpl2 extends SqlSessionDaoSupport implements IAccountDao{

    @Override
    public List<Account> findAll() {
        SqlSession sqlSession = getSqlSession();
        IAccountDao iAccountDao = sqlSession.getMapper(IAccountDao.class);
        return iAccountDao.findAll();
    }
}
