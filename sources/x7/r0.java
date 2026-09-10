package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f44906a;
    public final Boolean f44907b;
    public final h8 f44908c;

    public r0(v7.a6 a6Var) {
        this.f44906a = (n7) a6Var.f42934b;
        this.f44907b = (Boolean) a6Var.d;
        this.f44908c = (h8) a6Var.f42935c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f44906a, r0Var.f44906a) && n6.l.l(this.f44907b, r0Var.f44907b) && n6.l.l(null, null) && n6.l.l(this.f44908c, r0Var.f44908c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44906a, this.f44907b, null, this.f44908c});
    }
}
