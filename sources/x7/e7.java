package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50985a;
    public final Integer f50986b;

    public e7(n7.z0 z0Var) {
        this.f50985a = (d7) z0Var.f16573b;
        this.f50986b = (Integer) z0Var.f16574c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.m.l(this.f50985a, e7Var.f50985a) && n6.m.l(this.f50986b, e7Var.f50986b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50985a, this.f50986b, null, null});
    }
}
