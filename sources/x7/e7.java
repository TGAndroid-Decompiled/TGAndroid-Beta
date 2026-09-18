package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45657a;
    public final Integer f45658b;

    public e7(o0.a aVar) {
        this.f45657a = (d7) aVar.f15439b;
        this.f45658b = (Integer) aVar.f15440c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45657a, e7Var.f45657a) && n6.l.l(this.f45658b, e7Var.f45658b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45657a, this.f45658b, null, null});
    }
}
