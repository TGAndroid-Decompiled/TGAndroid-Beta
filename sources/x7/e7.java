package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f44746a;
    public final Integer f44747b;

    public e7(og.u0 u0Var) {
        this.f44746a = (d7) u0Var.f14497b;
        this.f44747b = (Integer) u0Var.f14498c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f44746a, e7Var.f44746a) && n6.l.l(this.f44747b, e7Var.f44747b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44746a, this.f44747b, null, null});
    }
}
