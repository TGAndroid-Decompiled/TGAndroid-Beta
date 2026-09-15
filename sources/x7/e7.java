package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f45406a;
    public final Integer f45407b;

    public e7(o0.a aVar) {
        this.f45406a = (d7) aVar.f15300b;
        this.f45407b = (Integer) aVar.f15301c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f45406a, e7Var.f45406a) && n6.l.l(this.f45407b, e7Var.f45407b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45406a, this.f45407b, null, null});
    }
}
