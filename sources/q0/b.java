package q0;

import j$.util.Objects;
public final class b {
    public final Object f55124a;
    public final Object f55125b;

    public b(Object obj, Object obj2) {
        this.f55124a = obj;
        this.f55125b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f55124a, this.f55124a) || !Objects.equals(bVar.f55125b, this.f55125b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f55124a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f55125b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f55124a + " " + this.f55125b + "}";
    }
}
