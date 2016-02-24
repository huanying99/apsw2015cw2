package ents;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-19T23:56:11")
@StaticMetamodel(Milestonefeedback.class)
public class Milestonefeedback_ { 

    public static volatile SingularAttribute<Milestonefeedback, Integer> milestonefeedbackid;
    public static volatile SingularAttribute<Milestonefeedback, Integer> milestonemark;
    public static volatile SingularAttribute<Milestonefeedback, Date> feedbackrecordeddate;
    public static volatile SingularAttribute<Milestonefeedback, String> textualfeedback;
    public static volatile SingularAttribute<Milestonefeedback, Date> feedbacktimeread;

}