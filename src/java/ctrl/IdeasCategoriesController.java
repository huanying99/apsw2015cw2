/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import bus.IdeacategoriesService;
import ents.Ideascategories;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Pavilion
 */
@Named(value = "ideasCategoriesController")
@RequestScoped
public class IdeasCategoriesController {

    /**
     * Creates a new instance of IdeasCategoriesController
     */
    public IdeasCategoriesController() {
    }
    @EJB
        private IdeacategoriesService ics;
        private Ideascategories c = new Ideascategories();

    public Ideascategories getC() {
        return c;
    }

    public void setC(Ideascategories c) {
        this.c = c;
    }
    public List<Ideascategories> getAllCategories() {
            return ics.findAllIcategories();
        }
}
