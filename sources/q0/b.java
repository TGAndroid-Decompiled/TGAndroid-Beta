package q0;

import j$.util.Objects;
public final class b {
    public final Object f46007a;
    public final Object f46008b;

    public b(Object obj, Object obj2) {
        this.f46007a = obj;
        this.f46008b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f46007a, this.f46007a) || !Objects.equals(bVar.f46008b, this.f46008b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f46007a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f46008b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f46007a + " " + this.f46008b + "}";
    }
}
