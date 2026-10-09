package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52045a;
    public final int f52046b;
    public final List f52047c;

    public r0(String str, int i10, List list) {
        this.f52045a = str;
        this.f52046b = i10;
        this.f52047c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52045a.equals(r0Var.f52045a) && this.f52046b == r0Var.f52046b && this.f52047c.equals(r0Var.f52047c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52045a.hashCode() ^ 1000003) * 1000003) ^ this.f52046b) * 1000003) ^ this.f52047c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52045a + ", importance=" + this.f52046b + ", frames=" + this.f52047c + "}";
    }
}
