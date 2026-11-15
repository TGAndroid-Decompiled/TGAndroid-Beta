package q7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f55424a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f55424a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f55424a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f55424a.equals(((g) obj).f55424a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55424a.hashCode();
    }

    public final String toString() {
        return this.f55424a.toString();
    }
}
