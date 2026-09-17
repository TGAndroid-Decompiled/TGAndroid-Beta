package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49150a;
    public final Boolean f49151b;
    public final h8 f49152c;

    public r0(v7.a6 a6Var) {
        this.f49150a = (n7) a6Var.f47379b;
        this.f49151b = (Boolean) a6Var.d;
        this.f49152c = (h8) a6Var.f47380c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49150a, r0Var.f49150a) && n6.l.l(this.f49151b, r0Var.f49151b) && n6.l.l(null, null) && n6.l.l(this.f49152c, r0Var.f49152c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49150a, this.f49151b, null, this.f49152c});
    }
}
