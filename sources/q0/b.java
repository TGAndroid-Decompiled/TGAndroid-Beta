package q0;

import j$.util.Objects;
public final class b {
    public final Object f45835a;
    public final Object f45836b;

    public b(Object obj, Object obj2) {
        this.f45835a = obj;
        this.f45836b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f45835a, this.f45835a) || !Objects.equals(bVar.f45836b, this.f45836b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f45835a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f45836b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f45835a + " " + this.f45836b + "}";
    }
}
