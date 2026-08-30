package s8;

import java.io.Serializable;
import java.util.Comparator;
public final class m extends h0 implements Serializable {
    public final Comparator f44135a;

    public m(Comparator comparator) {
        this.f44135a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f44135a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f44135a.equals(((m) obj).f44135a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44135a.hashCode();
    }

    public final String toString() {
        return this.f44135a.toString();
    }
}
