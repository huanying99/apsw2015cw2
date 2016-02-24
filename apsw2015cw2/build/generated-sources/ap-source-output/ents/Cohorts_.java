package ents;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-19T23:56:11")
@StaticMetamodel(Cohorts.class)
public class Cohorts_ { 

    public static volatile SingularAttribute<Cohorts, Integer> cohortid;
    public static volatile SingularAttribute<Cohorts, Date> registerenddate;
    public static volatile SingularAttribute<Cohorts, Date> registerstartdate;
    public static volatile SingularAttribute<Cohorts, Date> projectstartdate;
    public static volatile SingularAttribute<Cohorts, String> cohortdesc;
    public static volatile SingularAttribute<Cohorts, Date> projectenddate;

}