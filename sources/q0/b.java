package q0;

import j$.util.Objects;
public final class b {
    public final Object f45893a;
    public final Object f45894b;

    public b(Object obj, Object obj2) {
        this.f45893a = obj;
        this.f45894b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f45893a, this.f45893a) || !Objects.equals(bVar.f45894b, this.f45894b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f45893a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f45894b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i9 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f45893a + " " + this.f45894b + "}";
    }
}
