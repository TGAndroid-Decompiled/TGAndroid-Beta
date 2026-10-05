package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50766a;
    public final int f50767b;
    public final List f50768c;

    public r0(String str, int i10, List list) {
        this.f50766a = str;
        this.f50767b = i10;
        this.f50768c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50766a.equals(r0Var.f50766a) && this.f50767b == r0Var.f50767b && this.f50768c.equals(r0Var.f50768c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50766a.hashCode() ^ 1000003) * 1000003) ^ this.f50767b) * 1000003) ^ this.f50768c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50766a + ", importance=" + this.f50767b + ", frames=" + this.f50768c + "}";
    }
}
