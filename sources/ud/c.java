package ud;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c10;
        char c11;
        if (obj instanceof c) {
            char c12 = this.f43701a;
            char c13 = this.f43702b;
            if (c12 < c13 || c12 == c13 || (c10 = (cVar = (c) obj).f43701a) < (c11 = cVar.f43702b) || c10 == c11) {
                c cVar2 = (c) obj;
                if (c12 == cVar2.f43701a && c13 == cVar2.f43702b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f43701a;
        char c11 = this.f43702b;
        if (c10 < c11 || c10 == c11) {
            return (c10 * 31) + c11;
        }
        return -1;
    }

    public final String toString() {
        return this.f43701a + ".." + this.f43702b;
    }
}
