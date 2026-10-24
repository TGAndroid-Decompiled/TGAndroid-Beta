package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51930a;
    public final int f51931b;
    public final List f51932c;

    public r0(String str, int i10, List list) {
        this.f51930a = str;
        this.f51931b = i10;
        this.f51932c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51930a.equals(r0Var.f51930a) && this.f51931b == r0Var.f51931b && this.f51932c.equals(r0Var.f51932c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51930a.hashCode() ^ 1000003) * 1000003) ^ this.f51931b) * 1000003) ^ this.f51932c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51930a + ", importance=" + this.f51931b + ", frames=" + this.f51932c + "}";
    }
}
