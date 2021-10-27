package ddd.learning.tactical.framework;

import java.util.Date;

//public class DomainEvent<TIdentity> {
//    private TIdentity identity;
//    private Date occurredOn;
//
//    public DomainEvent(TIdentity identity) {
//
//        this.identity = identity;
//        this.occurredOn = new Date();
//    }
//
//    public TIdentity getIdentity() {
//        return identity;
//    }
//
//    public Date getOccurredOn() {
//        return occurredOn;
//    }
//}

public interface DomainEvent<TIdentity>{
    TIdentity getIdentity();
    public Date occurredOn();
}
