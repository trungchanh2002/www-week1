package chanh.com.daos;

import chanh.com.entities.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RoleDao {
    private EntityManager em;
    private EntityTransaction trans;

    public RoleDao(EntityManager em) {
        super();
        this.em = em;
        trans = em.getTransaction();
    }

    public void insert(Role role) {
        try {
            trans.begin();
            em.merge(role);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();
        }
    }
}
