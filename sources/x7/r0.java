package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f48136a;
    public final Boolean f48137b;
    public final h8 f48138c;

    public r0(u2.c cVar) {
        this.f48136a = (n7) cVar.f45875b;
        this.f48137b = (Boolean) cVar.f45876c;
        this.f48138c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f48136a, r0Var.f48136a) && n6.l.l(this.f48137b, r0Var.f48137b) && n6.l.l(null, null) && n6.l.l(this.f48138c, r0Var.f48138c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48136a, this.f48137b, null, this.f48138c});
    }
}
