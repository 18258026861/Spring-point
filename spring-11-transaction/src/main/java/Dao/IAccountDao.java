package Dao;

import pojo.Account;

/**
 * @author YZY
 * @date 2020/4/12 - 17:42
 */
public interface IAccountDao {

    void tx(int id,Account account);
    Account findByName(int  id);
    int addAccount(Account account);
    int deleteAccount(int id);

}
