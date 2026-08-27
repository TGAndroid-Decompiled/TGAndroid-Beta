package p8;

import java.io.Serializable;
import java.util.Comparator;

public final class q extends k0 implements Serializable {

    public final Comparator f45577a;

    public q(Comparator comparator) {
        this.f45577a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f45577a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return this.f45577a.equals(((q) obj).f45577a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45577a.hashCode();
    }

    public final String toString() {
        return this.f45577a.toString();
    }
}
