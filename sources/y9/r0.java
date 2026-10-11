package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52168a;
    public final int f52169b;
    public final List f52170c;

    public r0(String str, int i10, List list) {
        this.f52168a = str;
        this.f52169b = i10;
        this.f52170c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52168a.equals(r0Var.f52168a) && this.f52169b == r0Var.f52169b && this.f52170c.equals(r0Var.f52170c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52168a.hashCode() ^ 1000003) * 1000003) ^ this.f52169b) * 1000003) ^ this.f52170c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52168a + ", importance=" + this.f52169b + ", frames=" + this.f52170c + "}";
    }
}
