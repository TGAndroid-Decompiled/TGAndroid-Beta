package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51506a;
    public final int f51507b;
    public final List f51508c;

    public r0(String str, int i10, List list) {
        this.f51506a = str;
        this.f51507b = i10;
        this.f51508c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51506a.equals(r0Var.f51506a) && this.f51507b == r0Var.f51507b && this.f51508c.equals(r0Var.f51508c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51506a.hashCode() ^ 1000003) * 1000003) ^ this.f51507b) * 1000003) ^ this.f51508c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51506a + ", importance=" + this.f51507b + ", frames=" + this.f51508c + "}";
    }
}
