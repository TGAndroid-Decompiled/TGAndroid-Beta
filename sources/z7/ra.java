package z7;

import java.util.Arrays;
public final class ra {
    public final qa f52900a;
    public final Integer f52901b;

    public ra(n7.z0 z0Var) {
        this.f52900a = (qa) z0Var.f16847b;
        this.f52901b = (Integer) z0Var.f16848c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f52900a, raVar.f52900a) && n6.l.l(this.f52901b, raVar.f52901b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52900a, this.f52901b, null, null});
    }
}
