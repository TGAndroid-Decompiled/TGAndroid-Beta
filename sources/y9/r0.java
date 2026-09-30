package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46896a;
    public final int f46897b;
    public final List f46898c;

    public r0(String str, int i10, List list) {
        this.f46896a = str;
        this.f46897b = i10;
        this.f46898c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46896a.equals(r0Var.f46896a) && this.f46897b == r0Var.f46897b && this.f46898c.equals(r0Var.f46898c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46896a.hashCode() ^ 1000003) * 1000003) ^ this.f46897b) * 1000003) ^ this.f46898c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46896a + ", importance=" + this.f46897b + ", frames=" + this.f46898c + "}";
    }
}
