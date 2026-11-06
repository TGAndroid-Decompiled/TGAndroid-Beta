package q0;

import j$.util.Objects;
public final class b {
    public final Object f53585a;
    public final Object f53586b;

    public b(Object obj, Object obj2) {
        this.f53585a = obj;
        this.f53586b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f53585a, this.f53585a) || !Objects.equals(bVar.f53586b, this.f53586b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f53585a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f53586b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f53585a + " " + this.f53586b + "}";
    }
}
