package q0;

import j$.util.Objects;
public final class b {
    public final Object f42676a;
    public final Object f42677b;

    public b(Object obj, Object obj2) {
        this.f42676a = obj;
        this.f42677b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f42676a, this.f42676a) || !Objects.equals(bVar.f42677b, this.f42677b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f42676a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f42677b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f42676a + " " + this.f42677b + "}";
    }
}
