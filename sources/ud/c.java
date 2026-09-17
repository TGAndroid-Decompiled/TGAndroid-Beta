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
            char c12 = this.f47013a;
            char c13 = this.f47014b;
            if (c12 < c13 || c12 == c13 || (c10 = (cVar = (c) obj).f47013a) < (c11 = cVar.f47014b) || c10 == c11) {
                c cVar2 = (c) obj;
                if (c12 == cVar2.f47013a && c13 == cVar2.f47014b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f47013a;
        char c11 = this.f47014b;
        if (c10 < c11 || c10 == c11) {
            return (c10 * 31) + c11;
        }
        return -1;
    }

    public final String toString() {
        return this.f47013a + ".." + this.f47014b;
    }
}
