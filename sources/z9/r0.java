package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51461a;
    public final int f51462b;
    public final List f51463c;

    public r0(String str, int i10, List list) {
        this.f51461a = str;
        this.f51462b = i10;
        this.f51463c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51461a.equals(r0Var.f51461a) && this.f51462b == r0Var.f51462b && this.f51463c.equals(r0Var.f51463c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51461a.hashCode() ^ 1000003) * 1000003) ^ this.f51462b) * 1000003) ^ this.f51463c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51461a + ", importance=" + this.f51462b + ", frames=" + this.f51463c + "}";
    }
}
