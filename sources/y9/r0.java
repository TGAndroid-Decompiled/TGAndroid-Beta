package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46569a;
    public final int f46570b;
    public final List f46571c;

    public r0(String str, int i10, List list) {
        this.f46569a = str;
        this.f46570b = i10;
        this.f46571c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46569a.equals(r0Var.f46569a) && this.f46570b == r0Var.f46570b && this.f46571c.equals(r0Var.f46571c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46569a.hashCode() ^ 1000003) * 1000003) ^ this.f46570b) * 1000003) ^ this.f46571c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46569a + ", importance=" + this.f46570b + ", frames=" + this.f46571c + "}";
    }
}
