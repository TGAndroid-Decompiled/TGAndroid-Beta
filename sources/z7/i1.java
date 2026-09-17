package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51103a;
    public final Boolean f51104b;
    public final ve f51105c;

    public i1(v7.a6 a6Var) {
        this.f51103a = (gb) a6Var.f47379b;
        this.f51104b = (Boolean) a6Var.d;
        this.f51105c = (ve) a6Var.f47380c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51103a, i1Var.f51103a) && n6.l.l(this.f51104b, i1Var.f51104b) && n6.l.l(null, null) && n6.l.l(this.f51105c, i1Var.f51105c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51103a, this.f51104b, null, this.f51105c});
    }
}
