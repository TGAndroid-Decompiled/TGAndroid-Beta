package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48508a;
    public final Boolean f48509b;
    public final ve f48510c;

    public i1(v7.r1 r1Var) {
        this.f48508a = (gb) r1Var.f44101b;
        this.f48509b = (Boolean) r1Var.d;
        this.f48510c = (ve) r1Var.f44102c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48508a, i1Var.f48508a) && n6.l.l(this.f48509b, i1Var.f48509b) && n6.l.l(null, null) && n6.l.l(this.f48510c, i1Var.f48510c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48508a, this.f48509b, null, this.f48510c});
    }
}
