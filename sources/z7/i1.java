package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48478a;
    public final Boolean f48479b;
    public final ve f48480c;

    public i1(v7.r1 r1Var) {
        this.f48478a = (gb) r1Var.f44074b;
        this.f48479b = (Boolean) r1Var.d;
        this.f48480c = (ve) r1Var.f44075c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48478a, i1Var.f48478a) && n6.l.l(this.f48479b, i1Var.f48479b) && n6.l.l(null, null) && n6.l.l(this.f48480c, i1Var.f48480c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48478a, this.f48479b, null, this.f48480c});
    }
}
