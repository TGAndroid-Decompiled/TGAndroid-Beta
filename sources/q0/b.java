package q0;

import j$.util.Objects;
public final class b {
    public final Object f41027a;
    public final Object f41028b;

    public b(Object obj, Object obj2) {
        this.f41027a = obj;
        this.f41028b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41027a, this.f41027a) || !Objects.equals(bVar.f41028b, this.f41028b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41027a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41028b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41027a + " " + this.f41028b + "}";
    }
}
