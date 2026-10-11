package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50870a;
    public final Integer f50871b;

    public e7(n7.z0 z0Var) {
        this.f50870a = (d7) z0Var.f16905b;
        this.f50871b = (Integer) z0Var.f16906c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.m.l(this.f50870a, e7Var.f50870a) && n6.m.l(this.f50871b, e7Var.f50871b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50870a, this.f50871b, null, null});
    }
}
