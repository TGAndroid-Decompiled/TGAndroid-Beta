package q0;

import j$.util.Objects;
public final class b {
    public final Object f53627a;
    public final Object f53628b;

    public b(Object obj, Object obj2) {
        this.f53627a = obj;
        this.f53628b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f53627a, this.f53627a) || !Objects.equals(bVar.f53628b, this.f53628b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Object obj = this.f53627a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f53628b;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i3 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f53627a + " " + this.f53628b + "}";
    }
}
