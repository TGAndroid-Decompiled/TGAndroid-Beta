package q8;

import java.io.Serializable;
import java.util.Comparator;
public final class q extends k0 implements Serializable {
    public final Comparator f46484a;

    public q(Comparator comparator) {
        this.f46484a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f46484a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return this.f46484a.equals(((q) obj).f46484a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46484a.hashCode();
    }

    public final String toString() {
        return this.f46484a.toString();
    }
}
