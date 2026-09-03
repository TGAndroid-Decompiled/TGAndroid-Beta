package s8;

import java.io.Serializable;
import java.util.Comparator;
public final class m extends h0 implements Serializable {
    public final Comparator f47148a;

    public m(Comparator comparator) {
        this.f47148a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f47148a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f47148a.equals(((m) obj).f47148a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47148a.hashCode();
    }

    public final String toString() {
        return this.f47148a.toString();
    }
}
