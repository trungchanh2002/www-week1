package chanh.com.daos;

import chanh.com.entities.GrantAccess;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class GrantAccessDao {
    private EntityManager em;
    private EntityTransaction trans;

    public GrantAccessDao(EntityManager em) {
        super();
        this.em = em;
        trans = em.getTransaction();
    }

    public void insert(GrantAccess grantAccess) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            System.out.println(grantAccess);
            em.persist(grantAccess);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }
}
