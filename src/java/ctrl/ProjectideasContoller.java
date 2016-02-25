/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import bus.IdeacategoriesService;
import bus.ProjectIdeaService;
import ents.Ideascategories;
import ents.Projectideas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Pavilion
 */
@ManagedBean
@RequestScoped
public class ProjectideasContoller {

    /**
     * Creates a new instance of ProjectideasContoller
     */
    public ProjectideasContoller() {
    }
    @EJB
        private ProjectIdeaService pis;
        private IdeacategoriesService ics;
        private Projectideas pi = new Projectideas();
        private String titlesearchcriteria = "";
        private String categorysearchcriteria = "1";
        private String searchgrp = "1";
        private Date periodstartdate = new Date();
        private Date periodenddate = new Date();
        private Date pdate1 = new Date();
        private Date pdate2 = new Date();
        private  String pititle;
        private Ideascategories selectedIdeacategories;
        private Ideascategories ic = new Ideascategories();
         private String userid = "714757";

    public Projectideas getPi() {
        return pi;
    }

    public void setPi(Projectideas pi) {
        this.pi = pi;
    }

    public String getTitlesearchcriteria() {
        return titlesearchcriteria;
    }

    public void setTitlesearchcriteria(String titlesearchcriteria) {
        this.titlesearchcriteria = titlesearchcriteria;
    }

    public String getCategorysearchcriteria() {
        return categorysearchcriteria;
    }

    public void setCategorysearchcriteria(String categorysearchcriteria) {
        this.categorysearchcriteria = categorysearchcriteria;
    }

    public String getSearchgrp() {
        return searchgrp;
    }

    public void setSearchgrp(String searchgrp) {
        this.searchgrp = searchgrp;
    }

    public Date getPeriodstartdate() {
        return periodstartdate;
    }

    public void setPeriodstartdate(Date periodstartdate) {
        this.periodstartdate = periodstartdate;
    }

    public Date getPeriodenddate() {
        return periodenddate;
    }

    public void setPeriodenddate(Date periodenddate) {
        this.periodenddate = periodenddate;
    }

    public Date getPdate1() {
        return pdate1;
    }

    public void setPdate1(Date pdate1) {
        this.pdate1 = pdate1;
    }

    public Date getPdate2() {
        return pdate2;
    }

    public void setPdate2(Date pdate2) {
        this.pdate2 = pdate2;
    }

    public String getPititle() {
        return pititle;
    }

    public void setPititle(String pititle) {
        this.pititle = pititle;
    }

    public Ideascategories getSelectedIdeacategories() {
        return selectedIdeacategories;
    }

    public void setSelectedIdeacategories(Ideascategories selectedIdeacategories) {
        this.selectedIdeacategories = selectedIdeacategories;
    }

    public Ideascategories getIc() {
        return ic;
    }

    public void setIc(Ideascategories ic) {
        this.ic = ic;
    }
    public String getUserid() {
        return userid;
    }
    //clear all fields
    public void clearAllFields() {
       pi.setTitle("");
       pi.setAim("");
       pi.setPidesc("");
       pi.setAcademicquestion("");
       pi.setPicategory(1);
       pi.setNoofstudent(1);
//       pi.setSubmissiondate(Calendar.getInstance().getTime());
    }
    //add a project idea.
    public String doaddProjectIdea(){
            pis.addIdeas(pi);
            clearAllFields();
            return "";
    }
    public List<Projectideas> getAllIdeas() {
            return pis.findAllIdeas();
        }
              
        public List<Ideascategories> getAllIdeacategories() {
            return ics.findAllIcategories();
        }
        public String loadNewidearpt() {
            return "NewIdeaRpt";
        }
        
        public String loadIdeaSearchScrn() {
            return "pisearch";
//            return "/view/pisearch?faces-redirect=true";
        }
        public String searchIdea() {
                return "pisearch";
//                return "/view/pisearch?faces-redirect=true";
        }
        
        public List<Projectideas> getSearchAllIdeas() {
//            return pis.findAllIdeas();
            switch (searchgrp) {
                case "1": //project iead search by Idea Title
                    if(titlesearchcriteria.isEmpty() || titlesearchcriteria == null ) {
                    return pis.findAllIdeas();
                    } else {
                    return  pis.findAllProjectIdeaByTitleCriteria(this.titlesearchcriteria);
                    }
                case "2": //project iead search by category
                    if(categorysearchcriteria.isEmpty() || categorysearchcriteria == null) {
                    return pis.findAllIdeas();
                    } else {
                        userid = userid + categorysearchcriteria;
                    return  pis.findAllProjectIdeaByGroup(Integer.parseInt(categorysearchcriteria));
                    }
                default: //project iead search by project Idea submission date
                    if(periodstartdate == null || periodenddate == null ) {
                    return pis.findAllIdeas();
                    } else {
//                        userid = userid + periodstartdate.getYear();                        
                        SimpleDateFormat mydate = new SimpleDateFormat("dd/MM/yyyy");
                        SimpleDateFormat mydate1 = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat mydatego = new SimpleDateFormat("yyyy-MM-dd");
                        String mystring =mydate.format(periodenddate);
                        String mystring2 =mydate1.format(periodstartdate);
                        String mystring3 =mydate1.format(periodenddate);
                        userid = mystring2;                       
                        java.util.Date datefrom = null, dateto = null;                        
                        try {
                            pdate1 = (Date) mydate1.parse(mystring2);
                            pdate2 = (Date) mydate1.parse(mystring3);
                            datefrom = (java.util.Date)mydatego.parse(mystring2);
                            dateto = (java.util.Date)mydatego.parse(mystring3);
//                            Calendar cal = Calendar.getInstance();
//                            cal.setTime(datefrom);
                            userid = userid + dateto;                            
                        } catch (Exception e) {
                        }
//                    return  pis.findAllProjectIdeaWithinPeriod(periodstartdate, periodenddate);
                    return  pis.findAllProjectIdeaWithinPeriod(datefrom, dateto);
//                    return  pis.findAllProjectIdeaWithinPeriod(pdate1, pdate2);
                    }
            }
        }
}
