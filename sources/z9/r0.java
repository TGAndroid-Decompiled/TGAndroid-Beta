package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f55378a;
    public final int f55379b;
    public final List f55380c;

    public r0(String str, int i10, List list) {
        this.f55378a = str;
        this.f55379b = i10;
        this.f55380c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f55378a.equals(r0Var.f55378a) && this.f55379b == r0Var.f55379b && this.f55380c.equals(r0Var.f55380c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55378a.hashCode() ^ 1000003) * 1000003) ^ this.f55379b) * 1000003) ^ this.f55380c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f55378a + ", importance=" + this.f55379b + ", frames=" + this.f55380c + "}";
    }
}
