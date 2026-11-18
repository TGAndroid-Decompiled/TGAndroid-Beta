package q0;

import j$.util.Objects;
public final class b {
    public final Object f55700a;
    public final Object f55701b;

    public b(Object obj, Object obj2) {
        this.f55700a = obj;
        this.f55701b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f55700a, this.f55700a) || !Objects.equals(bVar.f55701b, this.f55701b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f55700a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f55701b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f55700a + " " + this.f55701b + "}";
    }
}
