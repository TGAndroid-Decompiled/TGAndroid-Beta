package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45402a;
    public final Integer f45403b;

    public e7(o0.a aVar) {
        this.f45402a = (d7) aVar.f15298b;
        this.f45403b = (Integer) aVar.f15299c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45402a, e7Var.f45402a) && n6.l.l(this.f45403b, e7Var.f45403b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45402a, this.f45403b, null, null});
    }
}
