package q0;

import j$.util.Objects;
public final class b {
    public final Object f41376a;
    public final Object f41377b;

    public b(Object obj, Object obj2) {
        this.f41376a = obj;
        this.f41377b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41376a, this.f41376a) || !Objects.equals(bVar.f41377b, this.f41377b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41376a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41377b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41376a + " " + this.f41377b + "}";
    }
}
