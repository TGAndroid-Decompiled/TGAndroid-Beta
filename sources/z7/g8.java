package z7;

import java.util.Arrays;
public final class g8 {
    public final Float f59883a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        if (p6.m.k(null, null) && p6.m.k(this.f59883a, g8Var.f59883a) && p6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f59883a, null});
    }
}
