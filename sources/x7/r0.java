package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45846a;
    public final Boolean f45847b;
    public final h8 f45848c;

    public r0(v7.l lVar) {
        this.f45846a = (n7) lVar.f44315b;
        this.f45847b = (Boolean) lVar.f44316c;
        this.f45848c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45846a, r0Var.f45846a) && n6.l.l(this.f45847b, r0Var.f45847b) && n6.l.l(null, null) && n6.l.l(this.f45848c, r0Var.f45848c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45846a, this.f45847b, null, this.f45848c});
    }
}
