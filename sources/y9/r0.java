package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50750a;
    public final int f50751b;
    public final List f50752c;

    public r0(String str, int i10, List list) {
        this.f50750a = str;
        this.f50751b = i10;
        this.f50752c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50750a.equals(r0Var.f50750a) && this.f50751b == r0Var.f50751b && this.f50752c.equals(r0Var.f50752c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50750a.hashCode() ^ 1000003) * 1000003) ^ this.f50751b) * 1000003) ^ this.f50752c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50750a + ", importance=" + this.f50751b + ", frames=" + this.f50752c + "}";
    }
}
