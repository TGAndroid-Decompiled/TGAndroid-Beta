package q7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f53883a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f53883a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53883a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f53883a.equals(((g) obj).f53883a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53883a.hashCode();
    }

    public final String toString() {
        return this.f53883a.toString();
    }
}
