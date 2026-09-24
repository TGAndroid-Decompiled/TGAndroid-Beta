package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46883a;
    public final int f46884b;
    public final List f46885c;

    public r0(String str, int i10, List list) {
        this.f46883a = str;
        this.f46884b = i10;
        this.f46885c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46883a.equals(r0Var.f46883a) && this.f46884b == r0Var.f46884b && this.f46885c.equals(r0Var.f46885c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46883a.hashCode() ^ 1000003) * 1000003) ^ this.f46884b) * 1000003) ^ this.f46885c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46883a + ", importance=" + this.f46884b + ", frames=" + this.f46885c + "}";
    }
}
