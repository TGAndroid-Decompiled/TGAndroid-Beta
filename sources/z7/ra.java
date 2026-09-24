package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48860a;
    public final Integer f48861b;

    public ra(n7.z0 z0Var) {
        this.f48860a = (qa) z0Var.f15395b;
        this.f48861b = (Integer) z0Var.f15396c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48860a, raVar.f48860a) && n6.l.l(this.f48861b, raVar.f48861b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48860a, this.f48861b, null, null});
    }
}
