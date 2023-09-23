package chanh.com.daos;

import chanh.com.entities.Account;
import jakarta.persistence.*;

import java.util.List;

public class AccountDao {
    private EntityManager em;
    private EntityTransaction trans;

    public AccountDao(EntityManager em) {
        super();
        this.em = em;
        trans = em.getTransaction();
    }

    public void insert(Account account) {
        try {
            trans.begin();
            em.merge(account);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();
        }
    }

    public Account getAccountById(String account_id) {
        TypedQuery<Account> query = em.createNamedQuery("Account.getAccountById", Account.class);
        query.setParameter("account_id", account_id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Account> getAllAccount() {
        TypedQuery<Account> query = em.createNamedQuery("Account.getAllAccount", Account.class);
        return query.getResultList();
    }

    public void deleteAccountById(String account_id) {
        Query query = em.createNamedQuery("Account.deleteAccountById");
        query.setParameter("account_id", account_id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        query.executeUpdate();
        transaction.commit();
    }

    public void updateAccountById(String account_id, String full_name, String password, String email, String phone, String status) {
        Query query = em.createNamedQuery("Account.updateAccountById");
        query.setParameter("account_id", account_id);
        query.setParameter("full_name", full_name);
        query.setParameter("password", password);
        query.setParameter("email", email);
        query.setParameter("phone", phone);
        query.setParameter("status", status);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        query.executeUpdate();
        transaction.commit();
    }

}