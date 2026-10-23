package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51931a;
    public final int f51932b;
    public final List f51933c;

    public r0(String str, int i10, List list) {
        this.f51931a = str;
        this.f51932b = i10;
        this.f51933c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51931a.equals(r0Var.f51931a) && this.f51932b == r0Var.f51932b && this.f51933c.equals(r0Var.f51933c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51931a.hashCode() ^ 1000003) * 1000003) ^ this.f51932b) * 1000003) ^ this.f51933c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51931a + ", importance=" + this.f51932b + ", frames=" + this.f51933c + "}";
    }
}
