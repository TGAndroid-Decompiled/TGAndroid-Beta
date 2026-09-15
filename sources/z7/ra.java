package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48600a;
    public final Integer f48601b;

    public ra(n7.a1 a1Var) {
        this.f48600a = (qa) a1Var.f15108b;
        this.f48601b = (Integer) a1Var.f15109c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48600a, raVar.f48600a) && n6.l.l(this.f48601b, raVar.f48601b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48600a, this.f48601b, null, null});
    }
}
