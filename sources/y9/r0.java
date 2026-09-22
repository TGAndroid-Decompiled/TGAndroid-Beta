package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46611a;
    public final int f46612b;
    public final List f46613c;

    public r0(String str, int i10, List list) {
        this.f46611a = str;
        this.f46612b = i10;
        this.f46613c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46611a.equals(r0Var.f46611a) && this.f46612b == r0Var.f46612b && this.f46613c.equals(r0Var.f46613c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46611a.hashCode() ^ 1000003) * 1000003) ^ this.f46612b) * 1000003) ^ this.f46613c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46611a + ", importance=" + this.f46612b + ", frames=" + this.f46613c + "}";
    }
}
