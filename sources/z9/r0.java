package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51470a;
    public final int f51471b;
    public final List f51472c;

    public r0(String str, int i10, List list) {
        this.f51470a = str;
        this.f51471b = i10;
        this.f51472c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51470a.equals(r0Var.f51470a) && this.f51471b == r0Var.f51471b && this.f51472c.equals(r0Var.f51472c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51470a.hashCode() ^ 1000003) * 1000003) ^ this.f51471b) * 1000003) ^ this.f51472c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51470a + ", importance=" + this.f51471b + ", frames=" + this.f51472c + "}";
    }
}
