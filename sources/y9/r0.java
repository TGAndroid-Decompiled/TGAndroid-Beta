package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46638a;
    public final int f46639b;
    public final List f46640c;

    public r0(String str, int i10, List list) {
        this.f46638a = str;
        this.f46639b = i10;
        this.f46640c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46638a.equals(r0Var.f46638a) && this.f46639b == r0Var.f46639b && this.f46640c.equals(r0Var.f46640c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46638a.hashCode() ^ 1000003) * 1000003) ^ this.f46639b) * 1000003) ^ this.f46640c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46638a + ", importance=" + this.f46639b + ", frames=" + this.f46640c + "}";
    }
}
