package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49472a;
    public final Integer f49473b;

    public e7(o0.a aVar) {
        this.f49472a = (d7) aVar.f16937b;
        this.f49473b = (Integer) aVar.f16938c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49472a, e7Var.f49472a) && n6.l.l(this.f49473b, e7Var.f49473b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49472a, this.f49473b, null, null});
    }
}
