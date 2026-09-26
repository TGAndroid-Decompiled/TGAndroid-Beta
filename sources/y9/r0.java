package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46893a;
    public final int f46894b;
    public final List f46895c;

    public r0(String str, int i10, List list) {
        this.f46893a = str;
        this.f46894b = i10;
        this.f46895c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46893a.equals(r0Var.f46893a) && this.f46894b == r0Var.f46894b && this.f46895c.equals(r0Var.f46895c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46893a.hashCode() ^ 1000003) * 1000003) ^ this.f46894b) * 1000003) ^ this.f46895c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46893a + ", importance=" + this.f46894b + ", frames=" + this.f46895c + "}";
    }
}
