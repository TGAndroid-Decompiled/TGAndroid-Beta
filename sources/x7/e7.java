package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49361a;
    public final Integer f49362b;

    public e7(mi.q qVar) {
        this.f49361a = (d7) qVar.f16975b;
        this.f49362b = (Integer) qVar.f16976c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49361a, e7Var.f49361a) && n6.l.l(this.f49362b, e7Var.f49362b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49361a, this.f49362b, null, null});
    }
}
