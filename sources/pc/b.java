package pc;

import kotlin.jvm.internal.j;

public final class b implements Comparable {

    public static final b f45686b = new b();

    public final int f45687a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        j.e(other, "other");
        return this.f45687a - other.f45687a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f45687a == bVar.f45687a;
    }

    public final int hashCode() {
        return this.f45687a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
