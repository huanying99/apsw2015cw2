/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import ctrl.ProjectBean;
import ents.Project;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import pers.ProjectFacade;

/**
 *
 * @author BriggsJ
 */
@FacesConverter(forClass = Project.class)
public class ProjectConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ProjectBean projectCtrl = (ProjectBean) facesContext.getApplication().getELResolver().
                getValue(facesContext.getELContext(), null, "projectBean");
        ProjectFacade pf = projectCtrl.getPf();
        Long id = Long.decode(value);
        Project p = pf.find(id);
        return p;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Project) {
            return ((Project) value).getId().toString();
        } else {
            throw new Error("object is not of type Project");
        }
    }

}
