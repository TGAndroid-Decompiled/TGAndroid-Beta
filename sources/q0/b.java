package q0;

import j$.util.Objects;
public final class b {
    public final Object f42706a;
    public final Object f42707b;

    public b(Object obj, Object obj2) {
        this.f42706a = obj;
        this.f42707b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f42706a, this.f42706a) || !Objects.equals(bVar.f42707b, this.f42707b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f42706a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f42707b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f42706a + " " + this.f42707b + "}";
    }
}
