/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import ents.Ideascategories;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.IdeascategoriesFacade;

/**
 *
 * @author Pavilion
 */
@Stateless
public class IdeacategoriesService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    private IdeascategoriesFacade icf;
    public Ideascategories addideacategory(Ideascategories ic) {
      if(true) {
          icf.create(ic);
      }  
      return ic;
    }
    
    public List<Ideascategories> findAllIcategories() {
        return icf.findAll();
    }
}
