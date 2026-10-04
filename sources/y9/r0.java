package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50751a;
    public final int f50752b;
    public final List f50753c;

    public r0(String str, int i10, List list) {
        this.f50751a = str;
        this.f50752b = i10;
        this.f50753c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50751a.equals(r0Var.f50751a) && this.f50752b == r0Var.f50752b && this.f50753c.equals(r0Var.f50753c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50751a.hashCode() ^ 1000003) * 1000003) ^ this.f50752b) * 1000003) ^ this.f50753c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50751a + ", importance=" + this.f50752b + ", frames=" + this.f50753c + "}";
    }
}
