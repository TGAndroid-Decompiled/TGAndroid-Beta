package x7;

import java.util.Arrays;
public final class r0 {
    public final o7 f45884a;
    public final Boolean f45885b;
    public final i8 f45886c;

    public r0(v7.s1 s1Var) {
        this.f45884a = (o7) s1Var.f44405b;
        this.f45885b = (Boolean) s1Var.d;
        this.f45886c = (i8) s1Var.f44406c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45884a, r0Var.f45884a) && n6.l.l(this.f45885b, r0Var.f45885b) && n6.l.l(null, null) && n6.l.l(this.f45886c, r0Var.f45886c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45884a, this.f45885b, null, this.f45886c});
    }
}
