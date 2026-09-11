package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49149a;
    public final Boolean f49150b;
    public final h8 f49151c;

    public r0(v7.a6 a6Var) {
        this.f49149a = (n7) a6Var.f47378b;
        this.f49150b = (Boolean) a6Var.d;
        this.f49151c = (h8) a6Var.f47379c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49149a, r0Var.f49149a) && n6.l.l(this.f49150b, r0Var.f49150b) && n6.l.l(null, null) && n6.l.l(this.f49151c, r0Var.f49151c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49149a, this.f49150b, null, this.f49151c});
    }
}
