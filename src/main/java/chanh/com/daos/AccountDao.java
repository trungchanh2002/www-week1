package chanh.com.daos;

import chanh.com.entities.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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
}