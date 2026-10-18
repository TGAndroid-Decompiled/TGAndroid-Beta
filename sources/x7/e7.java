package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49362a;
    public final Integer f49363b;

    public e7(mi.q qVar) {
        this.f49362a = (d7) qVar.f16972b;
        this.f49363b = (Integer) qVar.f16973c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49362a, e7Var.f49362a) && n6.l.l(this.f49363b, e7Var.f49363b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49362a, this.f49363b, null, null});
    }
}
