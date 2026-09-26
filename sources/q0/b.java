package q0;

import j$.util.Objects;
public final class b {
    public final Object f41363a;
    public final Object f41364b;

    public b(Object obj, Object obj2) {
        this.f41363a = obj;
        this.f41364b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41363a, this.f41363a) || !Objects.equals(bVar.f41364b, this.f41364b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41363a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41364b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41363a + " " + this.f41364b + "}";
    }
}
