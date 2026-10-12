package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f52279a;
    public final int f52280b;
    public final List f52281c;

    public r0(String str, int i10, List list) {
        this.f52279a = str;
        this.f52280b = i10;
        this.f52281c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f52279a.equals(r0Var.f52279a) && this.f52280b == r0Var.f52280b && this.f52281c.equals(r0Var.f52281c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52279a.hashCode() ^ 1000003) * 1000003) ^ this.f52280b) * 1000003) ^ this.f52281c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f52279a + ", importance=" + this.f52280b + ", frames=" + this.f52281c + "}";
    }
}
