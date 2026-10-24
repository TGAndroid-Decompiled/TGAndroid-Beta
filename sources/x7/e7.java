package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49813a;
    public final Integer f49814b;

    public e7(mi.q qVar) {
        this.f49813a = (d7) qVar.f17036b;
        this.f49814b = (Integer) qVar.f17037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49813a, e7Var.f49813a) && n6.l.l(this.f49814b, e7Var.f49814b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49813a, this.f49814b, null, null});
    }
}
