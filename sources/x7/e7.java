package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49368a;
    public final Integer f49369b;

    public e7(mi.q qVar) {
        this.f49368a = (d7) qVar.f16973b;
        this.f49369b = (Integer) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49368a, e7Var.f49368a) && n6.l.l(this.f49369b, e7Var.f49369b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49368a, this.f49369b, null, null});
    }
}
