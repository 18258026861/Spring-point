package Dao.Impl;

import Dao.IAccountDao;
import org.mybatis.spring.SqlSessionTemplate;
import pojo.Account;

import java.util.List;

/**
 * @author YZY
 * @date 2020/4/12 - 16:27
 */
public class AccountDaoImpl implements IAccountDao {

//    在mybatis，我们都用sqlSession对象来实现
//    而在Spring，我们用sqlSessionTemplate

    private SqlSessionTemplate sqlSessionTemplate;
//注入需要set方法
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

//    这部分相当于mybatis的测试环节，封装成了一个业务
    @Override
    public List<Account> findAll() {
        IAccountDao iAccountDao = sqlSessionTemplate.getMapper(IAccountDao.class);
        return iAccountDao.findAll();
    }
}
