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
            char c12 = this.f44071a;
            char c13 = this.f44072b;
            if (c12 < c13 || c12 == c13 || (c10 = (cVar = (c) obj).f44071a) < (c11 = cVar.f44072b) || c10 == c11) {
                c cVar2 = (c) obj;
                if (c12 == cVar2.f44071a && c13 == cVar2.f44072b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f44071a;
        char c11 = this.f44072b;
        if (c10 < c11 || c10 == c11) {
            return (c10 * 31) + c11;
        }
        return -1;
    }

    public final String toString() {
        return this.f44071a + ".." + this.f44072b;
    }
}
