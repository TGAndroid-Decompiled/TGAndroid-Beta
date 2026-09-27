package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45730a;
    public final Integer f45731b;

    public e7(o0.a aVar) {
        this.f45730a = (d7) aVar.f15519b;
        this.f45731b = (Integer) aVar.f15520c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45730a, e7Var.f45730a) && n6.l.l(this.f45731b, e7Var.f45731b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45730a, this.f45731b, null, null});
    }
}
