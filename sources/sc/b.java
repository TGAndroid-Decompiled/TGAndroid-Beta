package sc;

import kotlin.jvm.internal.j;
public final class b implements Comparable {
    public static final b f47233b = new b();
    public final int f47234a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        j.e(other, "other");
        return this.f47234a - other.f47234a;
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
        if (bVar != null && this.f47234a == bVar.f47234a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47234a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
