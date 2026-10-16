package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f47975a;
    public final Integer f47976b;

    public e7(m2.t tVar) {
        this.f47975a = (d7) tVar.f15110b;
        this.f47976b = (Integer) tVar.f15111c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f47975a, e7Var.f47975a) && n6.l.l(this.f47976b, e7Var.f47976b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47975a, this.f47976b, null, null});
    }
}
