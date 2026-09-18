package q0;

import j$.util.Objects;
public final class b {
    public final Object f41335a;
    public final Object f41336b;

    public b(Object obj, Object obj2) {
        this.f41335a = obj;
        this.f41336b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41335a, this.f41335a) || !Objects.equals(bVar.f41336b, this.f41336b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41335a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41336b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41335a + " " + this.f41336b + "}";
    }
}
