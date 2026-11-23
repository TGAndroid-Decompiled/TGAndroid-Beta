package q0;

import j$.util.Objects;
public final class b {
    public final Object f55710a;
    public final Object f55711b;

    public b(Object obj, Object obj2) {
        this.f55710a = obj;
        this.f55711b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f55710a, this.f55710a) || !Objects.equals(bVar.f55711b, this.f55711b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f55710a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f55711b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f55710a + " " + this.f55711b + "}";
    }
}
