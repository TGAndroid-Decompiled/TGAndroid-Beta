package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f49870a;
    public final int f49871b;
    public final List f49872c;

    public r0(String str, int i10, List list) {
        this.f49870a = str;
        this.f49871b = i10;
        this.f49872c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f49870a.equals(r0Var.f49870a) && this.f49871b == r0Var.f49871b && this.f49872c.equals(r0Var.f49872c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49870a.hashCode() ^ 1000003) * 1000003) ^ this.f49871b) * 1000003) ^ this.f49872c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f49870a + ", importance=" + this.f49871b + ", frames=" + this.f49872c + "}";
    }
}
