package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46917a;
    public final int f46918b;
    public final List f46919c;

    public r0(String str, int i10, List list) {
        this.f46917a = str;
        this.f46918b = i10;
        this.f46919c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46917a.equals(r0Var.f46917a) && this.f46918b == r0Var.f46918b && this.f46919c.equals(r0Var.f46919c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46917a.hashCode() ^ 1000003) * 1000003) ^ this.f46918b) * 1000003) ^ this.f46919c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46917a + ", importance=" + this.f46918b + ", frames=" + this.f46919c + "}";
    }
}
