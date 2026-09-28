package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46894a;
    public final int f46895b;
    public final List f46896c;

    public r0(String str, int i10, List list) {
        this.f46894a = str;
        this.f46895b = i10;
        this.f46896c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46894a.equals(r0Var.f46894a) && this.f46895b == r0Var.f46895b && this.f46896c.equals(r0Var.f46896c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46894a.hashCode() ^ 1000003) * 1000003) ^ this.f46895b) * 1000003) ^ this.f46896c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46894a + ", importance=" + this.f46895b + ", frames=" + this.f46896c + "}";
    }
}
