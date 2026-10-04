package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49631a;
    public final Boolean f49632b;
    public final h8 f49633c;

    public r0(v7.k kVar) {
        this.f49631a = (n7) kVar.f47978b;
        this.f49632b = (Boolean) kVar.f47979c;
        this.f49633c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49631a, r0Var.f49631a) && n6.l.l(this.f49632b, r0Var.f49632b) && n6.l.l(null, null) && n6.l.l(this.f49633c, r0Var.f49633c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49631a, this.f49632b, null, this.f49633c});
    }
}
