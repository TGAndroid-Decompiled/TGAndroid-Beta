package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45429a;
    public final Integer f45430b;

    public e7(o0.a aVar) {
        this.f45429a = (d7) aVar.f15310b;
        this.f45430b = (Integer) aVar.f15311c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45429a, e7Var.f45429a) && n6.l.l(this.f45430b, e7Var.f45430b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45429a, this.f45430b, null, null});
    }
}
