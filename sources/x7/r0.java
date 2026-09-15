package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45566a;
    public final Boolean f45567b;
    public final h8 f45568c;

    public r0(v7.r2 r2Var) {
        this.f45566a = (n7) r2Var.f44079b;
        this.f45567b = (Boolean) r2Var.f44080c;
        this.f45568c = (h8) r2Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45566a, r0Var.f45566a) && n6.l.l(this.f45567b, r0Var.f45567b) && n6.l.l(null, null) && n6.l.l(this.f45568c, r0Var.f45568c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45566a, this.f45567b, null, this.f45568c});
    }
}
