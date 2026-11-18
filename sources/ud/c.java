package ud;

import kotlin.jvm.internal.j;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c10 = this.f58584a;
            char c11 = this.f58585b;
            if (j.f(c10, c11) > 0) {
                c cVar = (c) obj;
                if (j.f(cVar.f58584a, cVar.f58585b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            if (c10 == cVar2.f58584a && c11 == cVar2.f58585b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f58584a;
        char c11 = this.f58585b;
        if (j.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f58584a + ".." + this.f58585b;
    }
}
