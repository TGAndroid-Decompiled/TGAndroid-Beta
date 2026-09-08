package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51133a;
    public final Boolean f51134b;
    public final ve f51135c;

    public i1(v7.a6 a6Var) {
        this.f51133a = (gb) a6Var.f47406b;
        this.f51134b = (Boolean) a6Var.d;
        this.f51135c = (ve) a6Var.f47407c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51133a, i1Var.f51133a) && n6.l.l(this.f51134b, i1Var.f51134b) && n6.l.l(null, null) && n6.l.l(this.f51135c, i1Var.f51135c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51133a, this.f51134b, null, this.f51135c});
    }
}
