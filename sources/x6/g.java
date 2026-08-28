package x6;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f49011a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f49011a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f49011a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f49011a.equals(((g) obj).f49011a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49011a.hashCode();
    }

    public final String toString() {
        return this.f49011a.toString();
    }
}
