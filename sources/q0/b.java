package q0;

import j$.util.Objects;
public final class b {
    public final Object f55745a;
    public final Object f55746b;

    public b(Object obj, Object obj2) {
        this.f55745a = obj;
        this.f55746b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f55745a, this.f55745a) || !Objects.equals(bVar.f55746b, this.f55746b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f55745a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f55746b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f55745a + " " + this.f55746b + "}";
    }
}
