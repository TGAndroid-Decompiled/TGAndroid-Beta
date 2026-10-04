package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49630a;
    public final Boolean f49631b;
    public final h8 f49632c;

    public r0(v7.k kVar) {
        this.f49630a = (n7) kVar.f47977b;
        this.f49631b = (Boolean) kVar.f47978c;
        this.f49632c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49630a, r0Var.f49630a) && n6.l.l(this.f49631b, r0Var.f49631b) && n6.l.l(null, null) && n6.l.l(this.f49632c, r0Var.f49632c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49630a, this.f49631b, null, this.f49632c});
    }
}
