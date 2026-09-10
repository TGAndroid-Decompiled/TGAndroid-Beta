package q0;

import j$.util.Objects;
public final class b {
    public final Object f40452a;
    public final Object f40453b;

    public b(Object obj, Object obj2) {
        this.f40452a = obj;
        this.f40453b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f40452a, this.f40452a) || !Objects.equals(bVar.f40453b, this.f40453b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f40452a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f40453b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f40452a + " " + this.f40453b + "}";
    }
}
