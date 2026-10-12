package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50977a;
    public final Integer f50978b;

    public e7(n7.z0 z0Var) {
        this.f50977a = (d7) z0Var.f16572b;
        this.f50978b = (Integer) z0Var.f16573c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.m.l(this.f50977a, e7Var.f50977a) && n6.m.l(this.f50978b, e7Var.f50978b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50977a, this.f50978b, null, null});
    }
}
