package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46765a;
    public final int f46766b;
    public final List f46767c;

    public r0(String str, int i10, List list) {
        this.f46765a = str;
        this.f46766b = i10;
        this.f46767c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46765a.equals(r0Var.f46765a) && this.f46766b == r0Var.f46766b && this.f46767c.equals(r0Var.f46767c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46765a.hashCode() ^ 1000003) * 1000003) ^ this.f46766b) * 1000003) ^ this.f46767c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46765a + ", importance=" + this.f46766b + ", frames=" + this.f46767c + "}";
    }
}
