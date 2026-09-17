package z7;

import java.util.Arrays;
public final class ra {
    public final qa f51259a;
    public final Integer f51260b;

    public ra(n7.z0 z0Var) {
        this.f51259a = (qa) z0Var.f16730b;
        this.f51260b = (Integer) z0Var.f16731c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f51259a, raVar.f51259a) && n6.l.l(this.f51260b, raVar.f51260b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51259a, this.f51260b, null, null});
    }
}
