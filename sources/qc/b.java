package qc;

import kotlin.jvm.internal.j;
public final class b implements Comparable {
    public static final b f46593b = new b();
    public final int f46594a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        j.e(other, "other");
        return this.f46594a - other.f46594a;
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
        if (bVar != null && this.f46594a == bVar.f46594a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46594a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
