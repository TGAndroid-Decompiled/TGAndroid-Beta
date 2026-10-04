package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50759a;
    public final int f50760b;
    public final List f50761c;

    public r0(String str, int i10, List list) {
        this.f50759a = str;
        this.f50760b = i10;
        this.f50761c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50759a.equals(r0Var.f50759a) && this.f50760b == r0Var.f50760b && this.f50761c.equals(r0Var.f50761c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50759a.hashCode() ^ 1000003) * 1000003) ^ this.f50760b) * 1000003) ^ this.f50761c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50759a + ", importance=" + this.f50760b + ", frames=" + this.f50761c + "}";
    }
}
