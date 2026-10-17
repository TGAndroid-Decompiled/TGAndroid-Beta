package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49384a;
    public final Integer f49385b;

    public e7(mi.q qVar) {
        this.f49384a = (d7) qVar.f16967b;
        this.f49385b = (Integer) qVar.f16968c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49384a, e7Var.f49384a) && n6.l.l(this.f49385b, e7Var.f49385b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49384a, this.f49385b, null, null});
    }
}
