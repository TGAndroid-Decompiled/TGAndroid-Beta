package q0;

import j$.util.Objects;
public final class b {
    public final Object f44329a;
    public final Object f44330b;

    public b(Object obj, Object obj2) {
        this.f44329a = obj;
        this.f44330b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f44329a, this.f44329a) || !Objects.equals(bVar.f44330b, this.f44330b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44329a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f44330b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f44329a + " " + this.f44330b + "}";
    }
}
