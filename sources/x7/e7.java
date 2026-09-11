package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f48975a;
    public final Integer f48976b;

    public e7(o0.a aVar) {
        this.f48975a = (d7) aVar.f16769b;
        this.f48976b = (Integer) aVar.f16770c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f48975a, e7Var.f48975a) && n6.l.l(this.f48976b, e7Var.f48976b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48975a, this.f48976b, null, null});
    }
}
