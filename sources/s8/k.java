package s8;

import l7.xa;
public abstract class k {
    public transient c f47142a;
    public transient l7.m f47143b;
    public transient xa f47144c;

    public abstract xa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((e0) this).a().equals(((e0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f12098b.hashCode();
    }

    public final String toString() {
        return a().f12098b.toString();
    }
}
