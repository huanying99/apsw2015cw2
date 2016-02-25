/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import ents.Projectideas;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.ProjectideasFacade;

/**
 *
 * @author Pavilion
 */
@Stateless
public class ProjectIdeaService {

    @EJB
        private ProjectideasFacade pif;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public Projectideas addIdeas(Projectideas pi) {
      if(true) {
          pif.create(pi);
      }  
      return pi;
    }
    public List<Projectideas> findAllIdeas() {
        return pif.findAll();
      }
          //pagination methods begins here
    public int ideasCount() {
        return pif.count();
    }
    public List<Projectideas> findRange(int [] range) {
        return pif.findRange(range);
    }
    
    public String projectideaExistStatus(Projectideas pi) {
        //report sucess person exist and failure otherwise
        List<Projectideas> list = pif.findProjectIdeaByName(pi.getTitle());
        if (list.isEmpty()) {
            return "Sucess";
        } else {
            return "Failure";
        }
    }
    
    public List<Projectideas> findAllProjectIdeaByTitleCriteria(String searchstring){
         return pif.findProjectIdeaByNameLike(searchstring);
    }
    
    public List<Projectideas> findAllProjectIdeaByGroup(int groupid){
         return pif.findProjectIdeaByCategory(groupid);
    }
    public List<Projectideas> findAllProjectIdeaWithinPeriod(Date startprd, Date endprd){
         return pif.findProjectIdeaByDatePrd(startprd, endprd);
    }
    
    public List<Projectideas> findAllProjectIdeaWithinPeriodz(String startprdx, String endprdx){
         return pif.findProjectIdeaByDatePrdz(startprdx, endprdx);
    }
}
