package q0;

import j$.util.Objects;
public final class b {
    public final Object f44316a;
    public final Object f44317b;

    public b(Object obj, Object obj2) {
        this.f44316a = obj;
        this.f44317b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f44316a, this.f44316a) || !Objects.equals(bVar.f44317b, this.f44317b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44316a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f44317b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f44316a + " " + this.f44317b + "}";
    }
}
