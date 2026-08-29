package z6;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f50711a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f50711a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f50711a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f50711a.equals(((g) obj).f50711a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50711a.hashCode();
    }

    public final String toString() {
        return this.f50711a.toString();
    }
}
