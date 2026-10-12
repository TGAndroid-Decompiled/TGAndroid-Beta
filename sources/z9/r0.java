package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f50075a;
    public final int f50076b;
    public final List f50077c;

    public r0(String str, int i10, List list) {
        this.f50075a = str;
        this.f50076b = i10;
        this.f50077c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f50075a.equals(r0Var.f50075a) && this.f50076b == r0Var.f50076b && this.f50077c.equals(r0Var.f50077c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50075a.hashCode() ^ 1000003) * 1000003) ^ this.f50076b) * 1000003) ^ this.f50077c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f50075a + ", importance=" + this.f50076b + ", frames=" + this.f50077c + "}";
    }
}
