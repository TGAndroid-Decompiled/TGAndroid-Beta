package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49457a;
    public final Integer f49458b;

    public e7(o0.a aVar) {
        this.f49457a = (d7) aVar.f16928b;
        this.f49458b = (Integer) aVar.f16929c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49457a, e7Var.f49457a) && n6.l.l(this.f49458b, e7Var.f49458b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49457a, this.f49458b, null, null});
    }
}
