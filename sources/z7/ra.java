package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48593a;
    public final Integer f48594b;

    public ra(n7.a1 a1Var) {
        this.f48593a = (qa) a1Var.f15106b;
        this.f48594b = (Integer) a1Var.f15107c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48593a, raVar.f48593a) && n6.l.l(this.f48594b, raVar.f48594b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48593a, this.f48594b, null, null});
    }
}
