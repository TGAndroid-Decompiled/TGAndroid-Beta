package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48871a;
    public final Integer f48872b;

    public ra(n7.z0 z0Var) {
        this.f48871a = (qa) z0Var.f15410b;
        this.f48872b = (Integer) z0Var.f15411c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48871a, raVar.f48871a) && n6.l.l(this.f48872b, raVar.f48872b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48871a, this.f48872b, null, null});
    }
}
