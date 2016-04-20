/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import ents.Project;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.ProjectFacade;

/**
 *
 * @author Pavilion
 */
@Stateless
public class ProjectIdeaService {
@EJB
//        private ProjectideasFacade pif;
        private ProjectFacade pif;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
public Project addIdeas(Project pi) {
      if(true) {
          pif.create(pi);
      }  
      return pi;
    }
    public Project addIdeas2(Project pi, String ownercode) {
      if(true) {
          pif.create(pi);
      }  
      return pi;
    }
    public List<Project> findAllIdeas() {
        return pif.findAll();
      }
          //pagination methods begins here
    public int ideasCount() {
        return pif.count();
    }
    public List<Project> findRange(int [] range) {
        return pif.findRange(range);
    }
    
    public String projectideaExistStatus(Project pi) {
        //report sucess person exist and failure otherwise
        List<Project> list = pif.findProjectIdeaByName(pi.getTitle());
        if (list.isEmpty()) {
            return "Sucess";
        } else {
            return "Failure";
        }
    }
    public  Project updatePIdea(Project pi) {
        pif.edit(pi);
        return pi;
    }
    //search Project Ideas by the title field.
    public List<Project> findAllProjectIdeaByTitleCriteria(String searchstring){
         return pif.findProjectIdeaByNameLike(searchstring);
    }
    //search Project Ideas using a search criteria on any field
    public List<Project> findAllProjectIdeaByAnyFieldCriteria(String searchstring){
         return pif.findProjectIdeaByAnyFieldLike(searchstring);
    }
    //search untreated Project Ideas using a search criteria on any field
    public List<Project> findAllUnprocessProjectIdeaByAnyFieldCriteria(String searchstring){
         return pif.findUntreatedProjectIdeaByAnyFieldLike(searchstring);
    }
    //find all project ideas by category
    public List<Project> findAllProjectIdeaByGroup(int groupid){
         return pif.findProjectIdeaByCategory(groupid);
    }
    //find all unprocess project ideas by category
    public List<Project> findAllUnprocessProjectIdeaByGroup(int groupid){
         return pif.findUntreatedProjectIdeaByCategory(groupid);
    }
    public List<Project> findAllProjectIdeaWithinPeriod(Date startprd, Date endprd){
         return pif.findProjectIdeaByDatePrd(startprd, endprd);
    }
    //find all project ideas by a user
    public List<Project> findAllProjectIdeaByAUser(long ownercode){
         return pif.findProjectIdeaByOwner(ownercode);
    }
    
    public List<Project> findAllProjectIdeaWithinPeriodz(String startprdx, String endprdx){
         return pif.findProjectIdeaByDatePrdz(startprdx, endprdx);
    }
    public List<Project> findAllUntrestedProjectIdeas(){
         return pif.findAllProjectIdeasUntreated();
    }
}
