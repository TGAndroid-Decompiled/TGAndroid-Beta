package sc;

import kotlin.jvm.internal.j;
public final class b implements Comparable {
    public static final b f44308b = new b();
    public final int f44309a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        j.e(other, "other");
        return this.f44309a - other.f44309a;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f44309a == bVar.f44309a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44309a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
