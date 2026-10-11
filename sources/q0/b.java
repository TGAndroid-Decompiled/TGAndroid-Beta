package q0;

import j$.util.Objects;
public final class b {
    public final Object f45973a;
    public final Object f45974b;

    public b(Object obj, Object obj2) {
        this.f45973a = obj;
        this.f45974b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f45973a, this.f45973a) || !Objects.equals(bVar.f45974b, this.f45974b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f45973a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f45974b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f45973a + " " + this.f45974b + "}";
    }
}
