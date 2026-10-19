package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49363a;
    public final Integer f49364b;

    public e7(mi.q qVar) {
        this.f49363a = (d7) qVar.f16973b;
        this.f49364b = (Integer) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49363a, e7Var.f49363a) && n6.l.l(this.f49364b, e7Var.f49364b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49363a, this.f49364b, null, null});
    }
}
