package Dao;

import pojo.Account;

import java.util.List;

/**
 * @author YZY
 * @date 2020/4/12 - 15:32
 */
public interface IAccountDao {

    List<Account> findAll();

}
