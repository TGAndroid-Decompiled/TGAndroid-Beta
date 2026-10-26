package q0;

import j$.util.Objects;
public final class b {
    public final Object f46894a;
    public final Object f46895b;

    public b(Object obj, Object obj2) {
        this.f46894a = obj;
        this.f46895b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f46894a, this.f46894a) || !Objects.equals(bVar.f46895b, this.f46895b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f46894a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f46895b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f46894a + " " + this.f46895b + "}";
    }
}
