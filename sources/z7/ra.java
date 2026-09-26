package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48870a;
    public final Integer f48871b;

    public ra(n7.z0 z0Var) {
        this.f48870a = (qa) z0Var.f15410b;
        this.f48871b = (Integer) z0Var.f15411c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48870a, raVar.f48870a) && n6.l.l(this.f48871b, raVar.f48871b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48870a, this.f48871b, null, null});
    }
}
