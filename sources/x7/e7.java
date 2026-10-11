package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50836a;
    public final Integer f50837b;

    public e7(n7.z0 z0Var) {
        this.f50836a = (d7) z0Var.f16869b;
        this.f50837b = (Integer) z0Var.f16870c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.m.l(this.f50836a, e7Var.f50836a) && n6.m.l(this.f50837b, e7Var.f50837b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50836a, this.f50837b, null, null});
    }
}
