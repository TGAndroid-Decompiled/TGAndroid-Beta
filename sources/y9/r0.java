package y9;

import java.util.List;
public final class r0 extends r1 {
    public final String f47002a;
    public final int f47003b;
    public final List f47004c;

    public r0(String str, int i10, List list) {
        this.f47002a = str;
        this.f47003b = i10;
        this.f47004c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f47002a.equals(r0Var.f47002a) && this.f47003b == r0Var.f47003b && this.f47004c.equals(r0Var.f47004c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47002a.hashCode() ^ 1000003) * 1000003) ^ this.f47003b) * 1000003) ^ this.f47004c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f47002a + ", importance=" + this.f47003b + ", frames=" + this.f47004c + "}";
    }
}
