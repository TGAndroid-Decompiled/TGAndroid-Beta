package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49409a;
    public final Integer f49410b;

    public e7(mi.q qVar) {
        this.f49409a = (d7) qVar.f16974b;
        this.f49410b = (Integer) qVar.f16975c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49409a, e7Var.f49409a) && n6.l.l(this.f49410b, e7Var.f49410b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49409a, this.f49410b, null, null});
    }
}
