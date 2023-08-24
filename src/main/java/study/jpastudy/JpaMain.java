package study.jpastudy;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        // persistence unit name 인자로 넘기기 (persistence.xml)
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        
        // Data Connection을 물고 동작하기 때문에 작업이 끝나면 반드시 닫아주어야 한다
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        // transaction 시작
        tx.begin();
        
        try {

            
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
