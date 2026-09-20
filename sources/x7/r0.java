package x7;

import java.util.Arrays;
public final class r0 {
    public final o7 f45863a;
    public final Boolean f45864b;
    public final i8 f45865c;

    public r0(v7.s1 s1Var) {
        this.f45863a = (o7) s1Var.f44383b;
        this.f45864b = (Boolean) s1Var.d;
        this.f45865c = (i8) s1Var.f44384c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45863a, r0Var.f45863a) && n6.l.l(this.f45864b, r0Var.f45864b) && n6.l.l(null, null) && n6.l.l(this.f45865c, r0Var.f45865c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45863a, this.f45864b, null, this.f45865c});
    }
}
