package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48979a;
    public final Integer f48980b;

    public ra(n7.z0 z0Var) {
        this.f48979a = (qa) z0Var.f15426b;
        this.f48980b = (Integer) z0Var.f15427c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48979a, raVar.f48979a) && n6.l.l(this.f48980b, raVar.f48980b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48979a, this.f48980b, null, null});
    }
}
