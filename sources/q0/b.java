package q0;

import j$.util.Objects;
public final class b {
    public final Object f41462a;
    public final Object f41463b;

    public b(Object obj, Object obj2) {
        this.f41462a = obj;
        this.f41463b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f41462a, this.f41462a) || !Objects.equals(bVar.f41463b, this.f41463b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f41462a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41463b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f41462a + " " + this.f41463b + "}";
    }
}
