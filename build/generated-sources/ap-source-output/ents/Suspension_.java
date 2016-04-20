package ents;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-19T23:56:11")
@StaticMetamodel(Suspension.class)
public class Suspension_ { 

    public static volatile SingularAttribute<Suspension, String> suspensionreason;
    public static volatile SingularAttribute<Suspension, Integer> suspensionid;
    public static volatile SingularAttribute<Suspension, Date> suspensiondate;
    public static volatile SingularAttribute<Suspension, Integer> personid;

}