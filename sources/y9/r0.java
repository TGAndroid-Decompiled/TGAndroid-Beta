package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f49869a;
    public final int f49870b;
    public final List f49871c;

    public r0(String str, int i10, List list) {
        this.f49869a = str;
        this.f49870b = i10;
        this.f49871c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f49869a.equals(r0Var.f49869a) && this.f49870b == r0Var.f49870b && this.f49871c.equals(r0Var.f49871c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49869a.hashCode() ^ 1000003) * 1000003) ^ this.f49870b) * 1000003) ^ this.f49871c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f49869a + ", importance=" + this.f49870b + ", frames=" + this.f49871c + "}";
    }
}
