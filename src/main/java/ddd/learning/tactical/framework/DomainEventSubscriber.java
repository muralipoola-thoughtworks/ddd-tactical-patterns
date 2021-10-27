package ddd.learning.tactical.framework;

public interface DomainEventSubscriber<T> {
    public void handleEvent(final T domainEvent);

    public Class<T> subscribedToEventType();
}
