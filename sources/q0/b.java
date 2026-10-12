package q0;

import j$.util.Objects;
public final class b {
    public final Object f43233a;
    public final Object f43234b;

    public b(Object obj, Object obj2) {
        this.f43233a = obj;
        this.f43234b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f43233a, this.f43233a) || !Objects.equals(bVar.f43234b, this.f43234b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f43233a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f43234b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f43233a + " " + this.f43234b + "}";
    }
}
