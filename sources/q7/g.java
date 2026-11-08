package q7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f53976a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f53976a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53976a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f53976a.equals(((g) obj).f53976a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53976a.hashCode();
    }

    public final String toString() {
        return this.f53976a.toString();
    }
}
