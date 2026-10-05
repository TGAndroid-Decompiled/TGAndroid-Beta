package z7;

import java.util.Arrays;
public final class ra {
    public final qa f52926a;
    public final Integer f52927b;

    public ra(n7.z0 z0Var) {
        this.f52926a = (qa) z0Var.f16856b;
        this.f52927b = (Integer) z0Var.f16857c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f52926a, raVar.f52926a) && n6.l.l(this.f52927b, raVar.f52927b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52926a, this.f52927b, null, null});
    }
}
