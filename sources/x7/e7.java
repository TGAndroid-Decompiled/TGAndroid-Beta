package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49371a;
    public final Integer f49372b;

    public e7(mi.q qVar) {
        this.f49371a = (d7) qVar.f16973b;
        this.f49372b = (Integer) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49371a, e7Var.f49371a) && n6.l.l(this.f49372b, e7Var.f49372b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49371a, this.f49372b, null, null});
    }
}
