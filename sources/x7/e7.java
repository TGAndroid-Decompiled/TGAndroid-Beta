package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45670a;
    public final Integer f45671b;

    public e7(o0.a aVar) {
        this.f45670a = (d7) aVar.f15467b;
        this.f45671b = (Integer) aVar.f15468c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45670a, e7Var.f45670a) && n6.l.l(this.f45671b, e7Var.f45671b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45670a, this.f45671b, null, null});
    }
}
