package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45356a;
    public final Integer f45357b;

    public e7(o0.a aVar) {
        this.f45356a = (d7) aVar.f15275b;
        this.f45357b = (Integer) aVar.f15276c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45356a, e7Var.f45356a) && n6.l.l(this.f45357b, e7Var.f45357b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45356a, this.f45357b, null, null});
    }
}
