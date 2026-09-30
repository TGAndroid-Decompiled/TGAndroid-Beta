package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48873a;
    public final Integer f48874b;

    public ra(n7.z0 z0Var) {
        this.f48873a = (qa) z0Var.f15411b;
        this.f48874b = (Integer) z0Var.f15412c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48873a, raVar.f48873a) && n6.l.l(this.f48874b, raVar.f48874b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48873a, this.f48874b, null, null});
    }
}
