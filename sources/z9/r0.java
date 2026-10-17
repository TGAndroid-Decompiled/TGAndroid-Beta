package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51481a;
    public final int f51482b;
    public final List f51483c;

    public r0(String str, int i10, List list) {
        this.f51481a = str;
        this.f51482b = i10;
        this.f51483c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51481a.equals(r0Var.f51481a) && this.f51482b == r0Var.f51482b && this.f51483c.equals(r0Var.f51483c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51481a.hashCode() ^ 1000003) * 1000003) ^ this.f51482b) * 1000003) ^ this.f51483c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51481a + ", importance=" + this.f51482b + ", frames=" + this.f51483c + "}";
    }
}
