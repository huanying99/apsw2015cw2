/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers;

import ents.Project;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author up792072
 */
@Stateless
public class ProjectFacade extends AbstractFacade<Project> {

    @PersistenceContext(unitName = "apsw2015cw2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    //codes before the entity relationship modification
       public List<Project> findAllProjectIdeasUntreated() {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.pistatus=0");
        return q.getResultList();
    }
    public List<Project> findProjectIdeaByName(String projectideatitle) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.title = :title");
        q.setParameter("title", projectideatitle);
        return q.getResultList();
    }
    
    public List<Project> findProjectIdeaByNameLike(String titlesearchstring) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE LOWER(i.title) LIKE :title");
        q.setParameter("title", "%" + titlesearchstring + "%");
        return q.getResultList();
    }
    public List<Project> findProjectIdeaByAnyFieldLike(String allfieldsearchstring) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE LOWER(i.title) LIKE :title OR LOWER(i.pidesc) LIKE :pidesc");
        q.setParameter("title", "%" + allfieldsearchstring + "%").setParameter("pidesc", "%" + allfieldsearchstring + "%");
        return q.getResultList();
    }
    //find all untreated project ideas
     public List<Project> findUntreatedProjectIdeaByAnyFieldLike(String allfieldsearchstring) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.pistatus=0 AND LOWER(i.title) LIKE :title OR LOWER(i.pidesc) LIKE :pidesc");
        q.setParameter("title", "%" + allfieldsearchstring + "%").setParameter("pidesc", "%" + allfieldsearchstring + "%");
        return q.getResultList();
    }
     // find all project ideas by project category   
    public List<Project> findProjectIdeaByCategory(int ideacategoryid) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.picategory = :picategory");
        q.setParameter("picategory", ideacategoryid);
        return q.getResultList();
    }
     // find all project ideas by project onerid   
    public List<Project> findProjectIdeaByOwner(long ideaownerid) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.ownerid = :ownerid");
        q.setParameter("ownerid", ideaownerid);
        return q.getResultList();
    }
    
     // find all untreated project ideas by project category   
    public List<Project> findUntreatedProjectIdeaByCategory(int ideacategoryid) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.pistatus=0 AND i.picategory = :picategory");
        q.setParameter("picategory", ideacategoryid);
        return q.getResultList();
    }
    
    public List<Project> findProjectIdeaByDatePrd(Date start, Date end) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.creationdate BETWEEN :creationdate AND :creationdate");
        q.setParameter("creationdate", start);
        q.setParameter("creationdate", end);
        return q.getResultList();
    }
    
    public List<Project> findProjectIdeaByDatePrdz(String start, String end) {
        Query q = em.createQuery("SELECT i FROM Project i WHERE i.creationdate BETWEEN :creationdate AND :creationdate");
        q.setParameter("creationdate", start);
        q.setParameter("creationdate", end);
        return q.getResultList();
    }
    
    public List<Project> findIdeasSorting() {
        Query q = em.createQuery("SELECT i FROM Project i ORDER BY title ASC");
        return q.getResultList();
    }
            
    public List<Project> findProjectAvailable() {
        Query q = em.createQuery("SELECT p FROM Project p WHERE p.status=2");
        return q.getResultList();
    }

    public void allocateProjectChoice(Project project) {
        Query q = em.createQuery("UPDATE Project p SET p.status=3 WHERE p.id=:projectid");
        q.setParameter("projectid", project.getId());
        q.executeUpdate();
    }

    public ProjectFacade() {
        super(Project.class);
    }

}
