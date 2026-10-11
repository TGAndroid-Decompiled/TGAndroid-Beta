package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52134a;
    public final int f52135b;
    public final List f52136c;

    public r0(String str, int i10, List list) {
        this.f52134a = str;
        this.f52135b = i10;
        this.f52136c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52134a.equals(r0Var.f52134a) && this.f52135b == r0Var.f52135b && this.f52136c.equals(r0Var.f52136c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52134a.hashCode() ^ 1000003) * 1000003) ^ this.f52135b) * 1000003) ^ this.f52136c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52134a + ", importance=" + this.f52135b + ", frames=" + this.f52136c + "}";
    }
}
