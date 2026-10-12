package x7;

import java.util.Arrays;
public final class h8 {
    public final Float f51031a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        if (n6.m.l(null, null) && n6.m.l(this.f51031a, h8Var.f51031a) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f51031a, null});
    }
}
