package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f49898a;
    public final int f49899b;
    public final List f49900c;

    public r0(String str, int i10, List list) {
        this.f49898a = str;
        this.f49899b = i10;
        this.f49900c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f49898a.equals(r0Var.f49898a) && this.f49899b == r0Var.f49899b && this.f49900c.equals(r0Var.f49900c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49898a.hashCode() ^ 1000003) * 1000003) ^ this.f49899b) * 1000003) ^ this.f49900c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f49898a + ", importance=" + this.f49899b + ", frames=" + this.f49900c + "}";
    }
}
