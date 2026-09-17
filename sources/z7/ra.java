package z7;

import java.util.Arrays;
public final class ra {
    public final qa f51228a;
    public final Integer f51229b;

    public ra(n7.z0 z0Var) {
        this.f51228a = (qa) z0Var.f16703b;
        this.f51229b = (Integer) z0Var.f16704c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f51228a, raVar.f51228a) && n6.l.l(this.f51229b, raVar.f51229b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51228a, this.f51229b, null, null});
    }
}
