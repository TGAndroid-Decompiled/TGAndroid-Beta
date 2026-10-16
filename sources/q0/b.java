package q0;

import j$.util.Objects;
public final class b {
    public final Object f42977a;
    public final Object f42978b;

    public b(Object obj, Object obj2) {
        this.f42977a = obj;
        this.f42978b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f42977a, this.f42977a) || !Objects.equals(bVar.f42978b, this.f42978b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f42977a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f42978b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f42977a + " " + this.f42978b + "}";
    }
}
