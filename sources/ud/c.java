package ud;

import kotlin.jvm.internal.j;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c10 = this.f58626a;
            char c11 = this.f58627b;
            if (j.f(c10, c11) > 0) {
                c cVar = (c) obj;
                if (j.f(cVar.f58626a, cVar.f58627b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            if (c10 == cVar2.f58626a && c11 == cVar2.f58627b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f58626a;
        char c11 = this.f58627b;
        if (j.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f58626a + ".." + this.f58627b;
    }
}
