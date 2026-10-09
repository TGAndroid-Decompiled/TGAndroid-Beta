package q0;

import j$.util.Objects;
public final class b {
    public final Object f45896a;
    public final Object f45897b;

    public b(Object obj, Object obj2) {
        this.f45896a = obj;
        this.f45897b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f45896a, this.f45896a) || !Objects.equals(bVar.f45897b, this.f45897b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f45896a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f45897b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f45896a + " " + this.f45897b + "}";
    }
}
