package ents;

import ents.Cohorts;
import ents.Milestones;
import ents.Registation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-20T15:37:48")
@StaticMetamodel(Milestonetemplate.class)
public class Milestonetemplate_ { 

    public static volatile SingularAttribute<Milestonetemplate, Date> mtactivedate;
    public static volatile SingularAttribute<Milestonetemplate, Date> mtduedate;
    public static volatile SingularAttribute<Milestonetemplate, Registation> milestonetemplateowner;
    public static volatile ListAttribute<Milestonetemplate, Cohorts> templatepicker;
    public static volatile SingularAttribute<Milestonetemplate, String> mtdesc;
    public static volatile SingularAttribute<Milestonetemplate, Long> mtstatus;
    public static volatile SingularAttribute<Milestonetemplate, Long> id;
    public static volatile SingularAttribute<Milestonetemplate, String> mttitle;
    public static volatile ListAttribute<Milestonetemplate, Milestones> mymilestone;

}