
package dao;

import Util.JPAutil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;

public class DAO <T> implements Serializable{
    private final Class <T> classe;
    EntityManager manager;
    
        public DAO (Class<T> classe){
            this.classe=classe;
        }
    public void insert (T objeto){
        manager = JPAutil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(objeto);
        tx.commit();
     }
    public List <T> listarTodos(){
        manager = JPAutil.getEntityManager();
        CriteriaQuery<T> query= manager.getCriteriaBuilder().createQuery(classe);
        query.select(query.from(classe));
        List<T> lista = manager.createQuery (query).getResultList();
        manager.close();
        return lista;
    }
}
