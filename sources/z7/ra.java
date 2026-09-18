package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48854a;
    public final Integer f48855b;

    public ra(n7.z0 z0Var) {
        this.f48854a = (qa) z0Var.f15367b;
        this.f48855b = (Integer) z0Var.f15368c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48854a, raVar.f48854a) && n6.l.l(this.f48855b, raVar.f48855b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48854a, this.f48855b, null, null});
    }
}
