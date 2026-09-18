package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46643a;
    public final int f46644b;
    public final List f46645c;

    public r0(String str, int i10, List list) {
        this.f46643a = str;
        this.f46644b = i10;
        this.f46645c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46643a.equals(r0Var.f46643a) && this.f46644b == r0Var.f46644b && this.f46645c.equals(r0Var.f46645c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46643a.hashCode() ^ 1000003) * 1000003) ^ this.f46644b) * 1000003) ^ this.f46645c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46643a + ", importance=" + this.f46644b + ", frames=" + this.f46645c + "}";
    }
}
