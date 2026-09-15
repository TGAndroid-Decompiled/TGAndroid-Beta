package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46615a;
    public final int f46616b;
    public final List f46617c;

    public r0(String str, int i10, List list) {
        this.f46615a = str;
        this.f46616b = i10;
        this.f46617c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46615a.equals(r0Var.f46615a) && this.f46616b == r0Var.f46616b && this.f46617c.equals(r0Var.f46617c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46615a.hashCode() ^ 1000003) * 1000003) ^ this.f46616b) * 1000003) ^ this.f46617c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46615a + ", importance=" + this.f46616b + ", frames=" + this.f46617c + "}";
    }
}
