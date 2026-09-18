package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46870a;
    public final int f46871b;
    public final List f46872c;

    public r0(String str, int i10, List list) {
        this.f46870a = str;
        this.f46871b = i10;
        this.f46872c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46870a.equals(r0Var.f46870a) && this.f46871b == r0Var.f46871b && this.f46872c.equals(r0Var.f46872c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46870a.hashCode() ^ 1000003) * 1000003) ^ this.f46871b) * 1000003) ^ this.f46872c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46870a + ", importance=" + this.f46871b + ", frames=" + this.f46872c + "}";
    }
}
