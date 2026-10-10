package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52091a;
    public final int f52092b;
    public final List f52093c;

    public r0(String str, int i10, List list) {
        this.f52091a = str;
        this.f52092b = i10;
        this.f52093c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52091a.equals(r0Var.f52091a) && this.f52092b == r0Var.f52092b && this.f52093c.equals(r0Var.f52093c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52091a.hashCode() ^ 1000003) * 1000003) ^ this.f52092b) * 1000003) ^ this.f52093c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52091a + ", importance=" + this.f52092b + ", frames=" + this.f52093c + "}";
    }
}
