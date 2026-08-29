package q8;

import j7.xa;
public abstract class k {
    public transient c f46459a;
    public transient j7.m f46460b;
    public transient xa f46461c;

    public abstract xa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((h0) this).a().equals(((h0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f11257b.hashCode();
    }

    public final String toString() {
        return a().f11257b.toString();
    }
}
