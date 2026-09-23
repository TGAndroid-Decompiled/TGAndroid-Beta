package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48543a;
    public final Integer f48544b;

    public ra(n7.a1 a1Var) {
        this.f48543a = (qa) a1Var.f15083b;
        this.f48544b = (Integer) a1Var.f15084c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48543a, raVar.f48543a) && n6.l.l(this.f48544b, raVar.f48544b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48543a, this.f48544b, null, null});
    }
}
