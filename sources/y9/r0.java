package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46895a;
    public final int f46896b;
    public final List f46897c;

    public r0(String str, int i10, List list) {
        this.f46895a = str;
        this.f46896b = i10;
        this.f46897c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46895a.equals(r0Var.f46895a) && this.f46896b == r0Var.f46896b && this.f46897c.equals(r0Var.f46897c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46895a.hashCode() ^ 1000003) * 1000003) ^ this.f46896b) * 1000003) ^ this.f46897c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46895a + ", importance=" + this.f46896b + ", frames=" + this.f46897c + "}";
    }
}
