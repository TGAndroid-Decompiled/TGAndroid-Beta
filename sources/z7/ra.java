package z7;

import java.util.Arrays;
public final class ra {
    public final qa f51227a;
    public final Integer f51228b;

    public ra(n7.z0 z0Var) {
        this.f51227a = (qa) z0Var.f16703b;
        this.f51228b = (Integer) z0Var.f16704c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f51227a, raVar.f51227a) && n6.l.l(this.f51228b, raVar.f51228b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51227a, this.f51228b, null, null});
    }
}
