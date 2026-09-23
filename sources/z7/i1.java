package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48428a;
    public final Boolean f48429b;
    public final ve f48430c;

    public i1(v7.r1 r1Var) {
        this.f48428a = (gb) r1Var.f44028b;
        this.f48429b = (Boolean) r1Var.d;
        this.f48430c = (ve) r1Var.f44029c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48428a, i1Var.f48428a) && n6.l.l(this.f48429b, i1Var.f48429b) && n6.l.l(null, null) && n6.l.l(this.f48430c, i1Var.f48430c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48428a, this.f48429b, null, this.f48430c});
    }
}
