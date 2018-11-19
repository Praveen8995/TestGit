package bank;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-17T01:02:05")
@StaticMetamodel(Mytable.class)
public class Mytable_ { 

    public static volatile SingularAttribute<Mytable, Integer> bankId;
    public static volatile SingularAttribute<Mytable, String> address;
    public static volatile SingularAttribute<Mytable, String> city;
    public static volatile SingularAttribute<Mytable, String> district;
    public static volatile SingularAttribute<Mytable, String> bankName;
    public static volatile SingularAttribute<Mytable, String> state;
    public static volatile SingularAttribute<Mytable, String> ifsc;
    public static volatile SingularAttribute<Mytable, String> branch;

}