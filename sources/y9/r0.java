package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f49899a;
    public final int f49900b;
    public final List f49901c;

    public r0(String str, int i10, List list) {
        this.f49899a = str;
        this.f49900b = i10;
        this.f49901c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f49899a.equals(r0Var.f49899a) && this.f49900b == r0Var.f49900b && this.f49901c.equals(r0Var.f49901c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49899a.hashCode() ^ 1000003) * 1000003) ^ this.f49900b) * 1000003) ^ this.f49901c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f49899a + ", importance=" + this.f49900b + ", frames=" + this.f49901c + "}";
    }
}
