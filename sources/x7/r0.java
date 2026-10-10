package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f50967a;
    public final Boolean f50968b;
    public final h8 f50969c;

    public r0(v7.k kVar) {
        this.f50967a = (n7) kVar.f49290b;
        this.f50968b = (Boolean) kVar.f49291c;
        this.f50969c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f50967a, r0Var.f50967a) && n6.l.l(this.f50968b, r0Var.f50968b) && n6.l.l(null, null) && n6.l.l(this.f50969c, r0Var.f50969c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50967a, this.f50968b, null, this.f50969c});
    }
}
