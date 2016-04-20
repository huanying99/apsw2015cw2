/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers;

import ents.Projectideas;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Pavilion
 */
@Stateless
public class ProjectideasFacade extends AbstractFacade<Projectideas> {
    @PersistenceContext(unitName = "apsw2015cw2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjectideasFacade() {
        super(Projectideas.class);
    }
    
    public List<Projectideas> findProjectIdeaByName(String projectideatitle) {
        Query q = em.createQuery("SELECT i FROM Projectideas i WHERE i.title = :title");
        q.setParameter("title", projectideatitle);
        return q.getResultList();
    }
    
    public List<Projectideas> findProjectIdeaByNameLike(String titlesearchstring) {
        Query q = em.createQuery("SELECT i FROM Projectideas i WHERE LOWER(i.title) LIKE :title");
        q.setParameter("title", "%" + titlesearchstring + "%");
        return q.getResultList();
    }
        
    public List<Projectideas> findProjectIdeaByCategory(int ideacategoryid) {
        Query q = em.createQuery("SELECT i FROM Projectideas i WHERE i.picategory = :picategory");
        q.setParameter("picategory", ideacategoryid);
        return q.getResultList();
    }
    
    public List<Projectideas> findProjectIdeaByDatePrd(Date start, Date end) {
        Query q = em.createQuery("SELECT i FROM Projectideas i WHERE i.projectideasubmdate BETWEEN :projectideasubmdate AND :projectideasubmdate");
        q.setParameter("projectideasubmdate", start);
        q.setParameter("projectideasubmdate", end);
        return q.getResultList();
    }
    
    public List<Projectideas> findProjectIdeaByDatePrdz(String start, String end) {
        Query q = em.createQuery("SELECT i FROM Projectideas i WHERE i.projectideasubmdate BETWEEN :projectideasubmdate AND :projectideasubmdate");
        q.setParameter("projectideasubmdate", start);
        q.setParameter("projectideasubmdate", end);
        return q.getResultList();
    }
    
    public List<Projectideas> findIdeasSorting() {
        Query q = em.createQuery("SELECT i FROM Projectideas i ORDER BY title ASC");
        return q.getResultList();
    }
}
