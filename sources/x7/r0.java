package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45843a;
    public final Boolean f45844b;
    public final h8 f45845c;

    public r0(v7.l lVar) {
        this.f45843a = (n7) lVar.f44312b;
        this.f45844b = (Boolean) lVar.f44313c;
        this.f45845c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45843a, r0Var.f45843a) && n6.l.l(this.f45844b, r0Var.f45844b) && n6.l.l(null, null) && n6.l.l(this.f45845c, r0Var.f45845c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45843a, this.f45844b, null, this.f45845c});
    }
}
