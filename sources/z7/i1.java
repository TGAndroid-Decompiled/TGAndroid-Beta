package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51134a;
    public final Boolean f51135b;
    public final ve f51136c;

    public i1(v7.a6 a6Var) {
        this.f51134a = (gb) a6Var.f47407b;
        this.f51135b = (Boolean) a6Var.d;
        this.f51136c = (ve) a6Var.f47408c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51134a, i1Var.f51134a) && n6.l.l(this.f51135b, i1Var.f51135b) && n6.l.l(null, null) && n6.l.l(this.f51136c, i1Var.f51136c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51134a, this.f51135b, null, this.f51136c});
    }
}
