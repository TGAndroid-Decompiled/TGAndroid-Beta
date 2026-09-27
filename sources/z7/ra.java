package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48915a;
    public final Integer f48916b;

    public ra(n7.z0 z0Var) {
        this.f48915a = (qa) z0Var.f15445b;
        this.f48916b = (Integer) z0Var.f15446c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48915a, raVar.f48915a) && n6.l.l(this.f48916b, raVar.f48916b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48915a, this.f48916b, null, null});
    }
}
