package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45589a;
    public final Boolean f45590b;
    public final h8 f45591c;

    public r0(v7.r1 r1Var) {
        this.f45589a = (n7) r1Var.f44101b;
        this.f45590b = (Boolean) r1Var.d;
        this.f45591c = (h8) r1Var.f44102c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45589a, r0Var.f45589a) && n6.l.l(this.f45590b, r0Var.f45590b) && n6.l.l(null, null) && n6.l.l(this.f45591c, r0Var.f45591c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45589a, this.f45590b, null, this.f45591c});
    }
}
