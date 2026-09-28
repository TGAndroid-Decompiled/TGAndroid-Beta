package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45845a;
    public final Boolean f45846b;
    public final h8 f45847c;

    public r0(v7.l lVar) {
        this.f45845a = (n7) lVar.f44314b;
        this.f45846b = (Boolean) lVar.f44315c;
        this.f45847c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45845a, r0Var.f45845a) && n6.l.l(this.f45846b, r0Var.f45846b) && n6.l.l(null, null) && n6.l.l(this.f45847c, r0Var.f45847c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45845a, this.f45846b, null, this.f45847c});
    }
}
