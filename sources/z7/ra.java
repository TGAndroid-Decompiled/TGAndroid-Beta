package z7;

import java.util.Arrays;
public final class ra {
    public final qa f52899a;
    public final Integer f52900b;

    public ra(n7.z0 z0Var) {
        this.f52899a = (qa) z0Var.f16846b;
        this.f52900b = (Integer) z0Var.f16847c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f52899a, raVar.f52899a) && n6.l.l(this.f52900b, raVar.f52900b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52899a, this.f52900b, null, null});
    }
}
