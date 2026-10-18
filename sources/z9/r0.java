package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51459a;
    public final int f51460b;
    public final List f51461c;

    public r0(String str, int i10, List list) {
        this.f51459a = str;
        this.f51460b = i10;
        this.f51461c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51459a.equals(r0Var.f51459a) && this.f51460b == r0Var.f51460b && this.f51461c.equals(r0Var.f51461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51459a.hashCode() ^ 1000003) * 1000003) ^ this.f51460b) * 1000003) ^ this.f51461c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51459a + ", importance=" + this.f51460b + ", frames=" + this.f51461c + "}";
    }
}
