package q7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f56043a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f56043a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f56043a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f56043a.equals(((g) obj).f56043a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56043a.hashCode();
    }

    public final String toString() {
        return this.f56043a.toString();
    }
}
