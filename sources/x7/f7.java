package x7;

import java.util.Arrays;
public final class f7 {
    public final e7 f45734a;
    public final Integer f45735b;

    public f7(d7 d7Var) {
        this.f45734a = (e7) d7Var.f45702a;
        this.f45735b = (Integer) d7Var.f45703b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        if (n6.l.l(this.f45734a, f7Var.f45734a) && n6.l.l(this.f45735b, f7Var.f45735b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45734a, this.f45735b, null, null});
    }
}
