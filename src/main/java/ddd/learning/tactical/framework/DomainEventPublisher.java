package ddd.learning.tactical.framework;

import java.util.ArrayList;
import java.util.List;

public class DomainEventPublisher {
    private static DomainEventPublisher domainEventPublisher = new DomainEventPublisher();
    private List subscribers;
    private boolean publishing;

    public static DomainEventPublisher instance() {
        return domainEventPublisher;
    }

    private DomainEventPublisher() {
        super();
        this.ensureSubscribersList();
    }

    public void publish(DomainEvent domainEvent) {
        if (!this.isPublishing() && this.hasSubscribers()) {

            try {
                this.setPublishing(true);

                Class<?> eventType = domainEvent.getClass();

                @SuppressWarnings("unchecked")
                List<DomainEventSubscriber> allSubscribers = this.subscribers();

                for (DomainEventSubscriber subscriber : allSubscribers) {
                    Class<?> subscribedToType = subscriber.subscribedToEventType();

                    if (eventType == subscribedToType || subscribedToType == DomainEvent.class) {
                        subscriber.handleEvent(domainEvent);
                    }
                }

            } finally {
                this.setPublishing(false);
            }
        }
    }

    public <T> void subscribe(DomainEventSubscriber<T> aSubscriber) {
        if (!this.isPublishing()) {
            this.ensureSubscribersList();

            this.subscribers().add(aSubscriber);
        }
    }

    private List subscribers() {
        return this.subscribers;
    }

    private boolean hasSubscribers() {
        return this.subscribers() != null;
    }

    private void ensureSubscribersList() {
        if (!this.hasSubscribers()) {
            this.setSubscribers(new ArrayList());
        }
    }

    public void reset() {
        if (!this.isPublishing()) {
            this.setSubscribers(null);
        }
    }

    private boolean isPublishing() {
        return this.publishing;
    }

    private void setPublishing(boolean aFlag) {
        this.publishing = aFlag;
    }

    private void setSubscribers(List aSubscriberList) {
        this.subscribers = aSubscriberList;
    }
}
