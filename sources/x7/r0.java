package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45890a;
    public final Boolean f45891b;
    public final h8 f45892c;

    public r0(v7.k kVar) {
        this.f45890a = (n7) kVar.f44349b;
        this.f45891b = (Boolean) kVar.f44350c;
        this.f45892c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45890a, r0Var.f45890a) && n6.l.l(this.f45891b, r0Var.f45891b) && n6.l.l(null, null) && n6.l.l(this.f45892c, r0Var.f45892c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45890a, this.f45891b, null, this.f45892c});
    }
}
