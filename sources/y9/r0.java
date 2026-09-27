package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46939a;
    public final int f46940b;
    public final List f46941c;

    public r0(String str, int i10, List list) {
        this.f46939a = str;
        this.f46940b = i10;
        this.f46941c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46939a.equals(r0Var.f46939a) && this.f46940b == r0Var.f46940b && this.f46941c.equals(r0Var.f46941c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46939a.hashCode() ^ 1000003) * 1000003) ^ this.f46940b) * 1000003) ^ this.f46941c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46939a + ", importance=" + this.f46940b + ", frames=" + this.f46941c + "}";
    }
}
