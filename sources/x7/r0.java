package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45817a;
    public final Boolean f45818b;
    public final h8 f45819c;

    public r0(v7.r1 r1Var) {
        this.f45817a = (n7) r1Var.f44332b;
        this.f45818b = (Boolean) r1Var.d;
        this.f45819c = (h8) r1Var.f44333c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45817a, r0Var.f45817a) && n6.l.l(this.f45818b, r0Var.f45818b) && n6.l.l(null, null) && n6.l.l(this.f45819c, r0Var.f45819c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45817a, this.f45818b, null, this.f45819c});
    }
}
