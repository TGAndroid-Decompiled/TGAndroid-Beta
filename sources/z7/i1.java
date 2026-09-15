package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48485a;
    public final Boolean f48486b;
    public final ve f48487c;

    public i1(v7.r2 r2Var) {
        this.f48485a = (gb) r2Var.f44079b;
        this.f48486b = (Boolean) r2Var.f44080c;
        this.f48487c = (ve) r2Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48485a, i1Var.f48485a) && n6.l.l(this.f48486b, i1Var.f48486b) && n6.l.l(null, null) && n6.l.l(this.f48487c, i1Var.f48487c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48485a, this.f48486b, null, this.f48487c});
    }
}
