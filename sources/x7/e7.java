package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45686a;
    public final Integer f45687b;

    public e7(o0.a aVar) {
        this.f45686a = (d7) aVar.f15483b;
        this.f45687b = (Integer) aVar.f15484c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45686a, e7Var.f45686a) && n6.l.l(this.f45687b, e7Var.f45687b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45686a, this.f45687b, null, null});
    }
}
