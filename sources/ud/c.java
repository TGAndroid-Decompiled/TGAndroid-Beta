package ud;

import kotlin.jvm.internal.j;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c10 = this.f56524a;
            char c11 = this.f56525b;
            if (j.f(c10, c11) > 0) {
                c cVar = (c) obj;
                if (j.f(cVar.f56524a, cVar.f56525b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            if (c10 == cVar2.f56524a && c11 == cVar2.f56525b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f56524a;
        char c11 = this.f56525b;
        if (j.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f56524a + ".." + this.f56525b;
    }
}
