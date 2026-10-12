package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54270a;
    public final Integer f54271b;

    public ra(n7.z0 z0Var) {
        this.f54270a = (qa) z0Var.f16573b;
        this.f54271b = (Integer) z0Var.f16574c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.m.l(this.f54270a, raVar.f54270a) && n6.m.l(this.f54271b, raVar.f54271b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54270a, this.f54271b, null, null});
    }
}
