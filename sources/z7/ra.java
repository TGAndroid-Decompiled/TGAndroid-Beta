package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54159a;
    public final Integer f54160b;

    public ra(n7.z0 z0Var) {
        this.f54159a = (qa) z0Var.f16905b;
        this.f54160b = (Integer) z0Var.f16906c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.m.l(this.f54159a, raVar.f54159a) && n6.m.l(this.f54160b, raVar.f54160b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54159a, this.f54160b, null, null});
    }
}
