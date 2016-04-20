package ents;

import ents.Milestones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-20T15:37:48")
@StaticMetamodel(Milestonefeedback.class)
public class Milestonefeedback_ { 

    public static volatile SingularAttribute<Milestonefeedback, Date> recordtime;
    public static volatile SingularAttribute<Milestonefeedback, String> moderatorfeedback;
    public static volatile SingularAttribute<Milestonefeedback, Milestones> belongfeedback;
    public static volatile SingularAttribute<Milestonefeedback, Long> id;
    public static volatile SingularAttribute<Milestonefeedback, Date> readtime;
    public static volatile SingularAttribute<Milestonefeedback, String> supervisorfeedback;
    public static volatile SingularAttribute<Milestonefeedback, Long> mark;

}