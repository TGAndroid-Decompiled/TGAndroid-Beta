package x7;

import java.util.Arrays;
public final class h8 {
    public final Float f49404a;

    public h8(le.b bVar) {
        this.f49404a = (Float) bVar.f16011b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        if (n6.l.l(null, null) && n6.l.l(this.f49404a, h8Var.f49404a) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f49404a, null});
    }
}
