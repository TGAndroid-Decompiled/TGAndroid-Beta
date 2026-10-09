package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52047a;
    public final int f52048b;
    public final List f52049c;

    public r0(String str, int i10, List list) {
        this.f52047a = str;
        this.f52048b = i10;
        this.f52049c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52047a.equals(r0Var.f52047a) && this.f52048b == r0Var.f52048b && this.f52049c.equals(r0Var.f52049c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52047a.hashCode() ^ 1000003) * 1000003) ^ this.f52048b) * 1000003) ^ this.f52049c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52047a + ", importance=" + this.f52048b + ", frames=" + this.f52049c + "}";
    }
}
