package q0;

import j$.util.Objects;
public final class b {
    public final Object f41097a;
    public final Object f41098b;

    public b(Object obj, Object obj2) {
        this.f41097a = obj;
        this.f41098b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41097a, this.f41097a) || !Objects.equals(bVar.f41098b, this.f41098b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41097a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41098b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41097a + " " + this.f41098b + "}";
    }
}
