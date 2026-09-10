package z7;

import java.util.Arrays;
public final class ra {
    public final qa f47716a;
    public final Integer f47717b;

    public ra(og.u0 u0Var) {
        this.f47716a = (qa) u0Var.f14497b;
        this.f47717b = (Integer) u0Var.f14498c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f47716a, raVar.f47716a) && n6.l.l(this.f47717b, raVar.f47717b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47716a, this.f47717b, null, null});
    }
}
