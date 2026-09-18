package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45434a;
    public final Integer f45435b;

    public e7(o0.a aVar) {
        this.f45434a = (d7) aVar.f15310b;
        this.f45435b = (Integer) aVar.f15311c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45434a, e7Var.f45434a) && n6.l.l(this.f45435b, e7Var.f45435b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45434a, this.f45435b, null, null});
    }
}
