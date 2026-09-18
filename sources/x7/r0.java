package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45594a;
    public final Boolean f45595b;
    public final h8 f45596c;

    public r0(v7.r1 r1Var) {
        this.f45594a = (n7) r1Var.f44106b;
        this.f45595b = (Boolean) r1Var.d;
        this.f45596c = (h8) r1Var.f44107c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45594a, r0Var.f45594a) && n6.l.l(this.f45595b, r0Var.f45595b) && n6.l.l(null, null) && n6.l.l(this.f45596c, r0Var.f45596c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45594a, this.f45595b, null, this.f45596c});
    }
}
