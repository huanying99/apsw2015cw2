/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;


import ents.Project;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import pers.ProjectFacade;

/**
 *
 * @author Administrator
 */
@Named(value = "projectBean")
@RequestScoped
public class ProjectBean extends AbstractController<Project, ProjectFacade>{

    @EJB
    private ProjectFacade pf;

    public ProjectFacade getPf() {
        return pf;
    }

    /**
     * Creates a new instance of AddressBean
     */
    public ProjectBean() {
    }


    public SelectItem[] getItemsAvailableSelectOneByProjectStatus() {
        return getSelectItems(pf.findProjectAvailable(), true);
    }

    @Override
    public ProjectFacade getFacade() {
        return pf;
    }


}
