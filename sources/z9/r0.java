package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f55396a;
    public final int f55397b;
    public final List f55398c;

    public r0(String str, int i10, List list) {
        this.f55396a = str;
        this.f55397b = i10;
        this.f55398c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f55396a.equals(r0Var.f55396a) && this.f55397b == r0Var.f55397b && this.f55398c.equals(r0Var.f55398c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55396a.hashCode() ^ 1000003) * 1000003) ^ this.f55397b) * 1000003) ^ this.f55398c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f55396a + ", importance=" + this.f55397b + ", frames=" + this.f55398c + "}";
    }
}
