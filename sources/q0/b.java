package q0;

import j$.util.Objects;
public final class b {
    public final Object f44743a;
    public final Object f44744b;

    public b(Object obj, Object obj2) {
        this.f44743a = obj;
        this.f44744b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f44743a, this.f44743a) || !Objects.equals(bVar.f44744b, this.f44744b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44743a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f44744b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f44743a + " " + this.f44744b + "}";
    }
}
