package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45516a;
    public final Boolean f45517b;
    public final h8 f45518c;

    public r0(v7.r1 r1Var) {
        this.f45516a = (n7) r1Var.f44028b;
        this.f45517b = (Boolean) r1Var.d;
        this.f45518c = (h8) r1Var.f44029c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45516a, r0Var.f45516a) && n6.l.l(this.f45517b, r0Var.f45517b) && n6.l.l(null, null) && n6.l.l(this.f45518c, r0Var.f45518c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45516a, this.f45517b, null, this.f45518c});
    }
}
