package ddd.learning.tactical.framework;

public abstract class Identity<TIdentity> {
    private TIdentity id;

    public Identity(TIdentity id) {
        this.id = id;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                "Type=" + getType() +
                '}';
    }
}
