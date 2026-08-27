package q0;

import j$.util.Objects;

public final class b {

    public final Object f46057a;

    public final Object f46058b;

    public b(Object obj, Object obj2) {
        this.f46057a = obj;
        this.f46058b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f46057a, this.f46057a) && Objects.equals(bVar.f46058b, this.f46058b);
    }

    public final int hashCode() {
        Object obj = this.f46057a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f46058b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f46057a + " " + this.f46058b + "}";
    }
}
