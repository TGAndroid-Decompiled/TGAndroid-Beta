package s8;

import l7.xa;
public abstract class k {
    public transient c f44196a;
    public transient l7.m f44197b;
    public transient xa f44198c;

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
        return a().f11804b.hashCode();
    }

    public final String toString() {
        return a().f11804b.toString();
    }
}
