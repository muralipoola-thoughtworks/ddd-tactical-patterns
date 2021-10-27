package ddd.learning.tactical.framework;

import java.util.Date;

public class AbstractDomainEvent<TIdentity> implements DomainEvent<TIdentity> {
    private TIdentity identity;
    private Date occurredOn;

    public AbstractDomainEvent(TIdentity identity) {
        this.identity = identity;
        this.occurredOn = new Date();
    }

    public TIdentity getIdentity() {
        return identity;
    }

    public Date occurredOn() {
        return occurredOn;
    }

    public int eventVersion() {
        return 0;
    }
}
