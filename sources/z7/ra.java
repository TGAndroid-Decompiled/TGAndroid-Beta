package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54262a;
    public final Integer f54263b;

    public ra(n7.z0 z0Var) {
        this.f54262a = (qa) z0Var.f16572b;
        this.f54263b = (Integer) z0Var.f16573c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.m.l(this.f54262a, raVar.f54262a) && n6.m.l(this.f54263b, raVar.f54263b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54262a, this.f54263b, null, null});
    }
}
