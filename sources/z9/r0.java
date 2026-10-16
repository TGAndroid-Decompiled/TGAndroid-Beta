package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50076a;
    public final int f50077b;
    public final List f50078c;

    public r0(String str, int i10, List list) {
        this.f50076a = str;
        this.f50077b = i10;
        this.f50078c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50076a.equals(r0Var.f50076a) && this.f50077b == r0Var.f50077b && this.f50078c.equals(r0Var.f50078c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50076a.hashCode() ^ 1000003) * 1000003) ^ this.f50077b) * 1000003) ^ this.f50078c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50076a + ", importance=" + this.f50077b + ", frames=" + this.f50078c + "}";
    }
}
