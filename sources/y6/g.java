package y6;

import java.io.Serializable;
import java.util.Comparator;

public final class g extends w implements Serializable {

    public final Comparator f49728a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f49728a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f49728a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f49728a.equals(((g) obj).f49728a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49728a.hashCode();
    }

    public final String toString() {
        return this.f49728a.toString();
    }
}
