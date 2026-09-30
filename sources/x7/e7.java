package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45792a;
    public final Integer f45793b;

    public e7(o0.a aVar) {
        this.f45792a = (d7) aVar.f15498b;
        this.f45793b = (Integer) aVar.f15499c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45792a, e7Var.f45792a) && n6.l.l(this.f45793b, e7Var.f45793b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45792a, this.f45793b, null, null});
    }
}
