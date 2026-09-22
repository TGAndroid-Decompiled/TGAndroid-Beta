package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f46938a;
    public final int f46939b;
    public final List f46940c;

    public r0(String str, int i10, List list) {
        this.f46938a = str;
        this.f46939b = i10;
        this.f46940c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f46938a.equals(r0Var.f46938a) && this.f46939b == r0Var.f46939b && this.f46940c.equals(r0Var.f46940c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46938a.hashCode() ^ 1000003) * 1000003) ^ this.f46939b) * 1000003) ^ this.f46940c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f46938a + ", importance=" + this.f46939b + ", frames=" + this.f46940c + "}";
    }
}
