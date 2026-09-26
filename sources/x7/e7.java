package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45683a;
    public final Integer f45684b;

    public e7(o0.a aVar) {
        this.f45683a = (d7) aVar.f15482b;
        this.f45684b = (Integer) aVar.f15483c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45683a, e7Var.f45683a) && n6.l.l(this.f45684b, e7Var.f45684b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45683a, this.f45684b, null, null});
    }
}
