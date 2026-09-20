package x7;

import java.util.Arrays;
public final class f7 {
    public final e7 f45713a;
    public final Integer f45714b;

    public f7(d7 d7Var) {
        this.f45713a = (e7) d7Var.f45681a;
        this.f45714b = (Integer) d7Var.f45682b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        if (n6.l.l(this.f45713a, f7Var.f45713a) && n6.l.l(this.f45714b, f7Var.f45714b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45713a, this.f45714b, null, null});
    }
}
