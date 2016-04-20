/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import ctrl.RegistationBean;
import ents.Registation;
import pers.RegistationFacade;


/**
 *
 * @author BriggsJ
 */
@FacesConverter(forClass = Registation.class)
public class RegistationConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        RegistationBean regCtrl = (RegistationBean) facesContext.getApplication().getELResolver().
                getValue(facesContext.getELContext(), null, "registationBean");
        RegistationFacade rf = regCtrl.getRf();
        Long id = Long.decode(value);
        Registation r = rf.find(id);
        return r;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Registation) {
            return ((Registation) value).getId().toString();
        } else {
            throw new Error("object is not of type Registation");
        }
    }

}
