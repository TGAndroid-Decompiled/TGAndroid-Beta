package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49372a;
    public final Integer f49373b;

    public e7(mi.q qVar) {
        this.f49372a = (d7) qVar.f16973b;
        this.f49373b = (Integer) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49372a, e7Var.f49372a) && n6.l.l(this.f49373b, e7Var.f49373b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49372a, this.f49373b, null, null});
    }
}
