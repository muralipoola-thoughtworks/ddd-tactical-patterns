package ddd.learning.tactical.framework;

import java.util.Objects;

public abstract class Entity<TIdentity> extends AssertionConcern {
     TIdentity id;

    public Entity(TIdentity id) {
        this.id = id;
    }

    public TIdentity getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
