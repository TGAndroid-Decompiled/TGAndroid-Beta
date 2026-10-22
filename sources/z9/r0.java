package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51469a;
    public final int f51470b;
    public final List f51471c;

    public r0(String str, int i10, List list) {
        this.f51469a = str;
        this.f51470b = i10;
        this.f51471c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51469a.equals(r0Var.f51469a) && this.f51470b == r0Var.f51470b && this.f51471c.equals(r0Var.f51471c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51469a.hashCode() ^ 1000003) * 1000003) ^ this.f51470b) * 1000003) ^ this.f51471c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51469a + ", importance=" + this.f51470b + ", frames=" + this.f51471c + "}";
    }
}
