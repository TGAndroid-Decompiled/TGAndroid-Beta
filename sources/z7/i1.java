package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51102a;
    public final Boolean f51103b;
    public final ve f51104c;

    public i1(v7.a6 a6Var) {
        this.f51102a = (gb) a6Var.f47378b;
        this.f51103b = (Boolean) a6Var.d;
        this.f51104c = (ve) a6Var.f47379c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51102a, i1Var.f51102a) && n6.l.l(this.f51103b, i1Var.f51103b) && n6.l.l(null, null) && n6.l.l(this.f51104c, i1Var.f51104c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51102a, this.f51103b, null, this.f51104c});
    }
}
