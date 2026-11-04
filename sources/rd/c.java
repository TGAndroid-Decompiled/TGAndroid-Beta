package rd;

import kotlin.jvm.internal.j;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c2 = this.f54490a;
            char c10 = this.f54491b;
            if (j.f(c2, c10) > 0) {
                c cVar = (c) obj;
                if (j.f(cVar.f54490a, cVar.f54491b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            if (c2 == cVar2.f54490a && c10 == cVar2.f54491b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c2 = this.f54490a;
        char c10 = this.f54491b;
        if (j.f(c2, c10) > 0) {
            return -1;
        }
        return (c2 * 31) + c10;
    }

    public final String toString() {
        return this.f54490a + ".." + this.f54491b;
    }
}
