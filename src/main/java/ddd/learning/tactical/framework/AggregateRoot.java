package ddd.learning.tactical.framework;

import java.util.List;

public abstract class AggregateRoot<TIdentity> extends Entity<TIdentity> {

    private List<DomainEvent<TIdentity>> eventLog;

    public AggregateRoot(TIdentity id) {
        super(id);
    }

    public List<DomainEvent<TIdentity>> getEventLog() {
        return this.eventLog;
    }

    public void publish(DomainEvent<TIdentity> domainEvent) {
        this.eventLog.add(domainEvent);
        DomainEventPublisher.instance().publish(domainEvent);
    }
}
