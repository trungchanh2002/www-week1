package chanh.com.apptest;

import chanh.com.daos.AccountDao;
import chanh.com.daos.GrantAccessDao;
import chanh.com.daos.LogDao;
import chanh.com.daos.RoleDao;
import chanh.com.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chanh");
        EntityManager em = emf.createEntityManager();

        AccountDao accountDao = new AccountDao(em);
        RoleDao roleDao = new RoleDao(em);
        GrantAccessDao grantAccessDao = new GrantAccessDao(em);
        LogDao logDao = new LogDao(em);
        Account account1 = new Account("chanh", "Nguyen Van chanh", "123", "chanh@gmail.com", "12345678", 1);
        Account account2 = new Account("trung", "Nguyen Van trung", "123", "trung@gmail.com", "12345679", 1);
        accountDao.insert(account1);
        accountDao.insert(account2);
        Role role1 = new Role("admin", "adminstrator", "admin role", 1);
        Role role2 = new Role("user", "user", "user role", 1);
        roleDao.insert(role1);
        roleDao.insert(role2);
        Logs logs1 = new Logs(1, "chanh", LocalDate.of(2023, 9, 20), LocalDate.of(2023, 9, 22), "note 1");
        Logs logs2 = new Logs(2, "trung", LocalDate.of(2023, 9, 20), LocalDate.of(2023, 9, 22), "note 2");
        logDao.insert(logs1);
        logDao.insert(logs2);
        GrantAccess grantAccess1 = new GrantAccess(account1, role1, IsGrant.enable, "note1");
        GrantAccess grantAccess2 = new GrantAccess(account2, role2, IsGrant.enable, "note2");
        grantAccessDao.insert(grantAccess1);
        grantAccessDao.insert(grantAccess2);
    }
}