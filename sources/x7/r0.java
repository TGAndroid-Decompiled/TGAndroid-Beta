package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45844a;
    public final Boolean f45845b;
    public final h8 f45846c;

    public r0(v7.l lVar) {
        this.f45844a = (n7) lVar.f44313b;
        this.f45845b = (Boolean) lVar.f44314c;
        this.f45846c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45844a, r0Var.f45844a) && n6.l.l(this.f45845b, r0Var.f45845b) && n6.l.l(null, null) && n6.l.l(this.f45846c, r0Var.f45846c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45844a, this.f45845b, null, this.f45846c});
    }
}
