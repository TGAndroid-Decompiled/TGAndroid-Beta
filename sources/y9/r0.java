package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52271a;
    public final int f52272b;
    public final List f52273c;

    public r0(String str, int i10, List list) {
        this.f52271a = str;
        this.f52272b = i10;
        this.f52273c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52271a.equals(r0Var.f52271a) && this.f52272b == r0Var.f52272b && this.f52273c.equals(r0Var.f52273c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52271a.hashCode() ^ 1000003) * 1000003) ^ this.f52272b) * 1000003) ^ this.f52273c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52271a + ", importance=" + this.f52272b + ", frames=" + this.f52273c + "}";
    }
}
