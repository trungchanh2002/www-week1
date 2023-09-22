package chanh.com.daos;

import chanh.com.entities.Logs;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LogDao {
    private EntityManager em;
    private EntityTransaction trans;

    public LogDao(EntityManager em) {
        super();
        this.em = em;
        trans = em.getTransaction();
    }

    public void insert(Logs logs) {
        try {
            trans.begin();
            em.merge(logs);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();
        }
    }
}
