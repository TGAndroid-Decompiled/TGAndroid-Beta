package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f48976a;
    public final Integer f48977b;

    public e7(o0.a aVar) {
        this.f48976a = (d7) aVar.f16769b;
        this.f48977b = (Integer) aVar.f16770c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f48976a, e7Var.f48976a) && n6.l.l(this.f48977b, e7Var.f48977b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48976a, this.f48977b, null, null});
    }
}
