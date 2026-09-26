package q0;

import j$.util.Objects;
public final class b {
    public final Object f41362a;
    public final Object f41363b;

    public b(Object obj, Object obj2) {
        this.f41362a = obj;
        this.f41363b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41362a, this.f41362a) || !Objects.equals(bVar.f41363b, this.f41363b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41362a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41363b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41362a + " " + this.f41363b + "}";
    }
}
