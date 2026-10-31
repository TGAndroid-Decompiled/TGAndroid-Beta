package z7;

import java.util.Arrays;
public final class ra {
    public final qa f55076a;
    public final Integer f55077b;

    public ra(x7.g8 g8Var) {
        this.f55076a = (qa) g8Var.f53164b;
        this.f55077b = (Integer) g8Var.f53165c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.k(this.f55076a, raVar.f55076a) && n6.l.k(this.f55077b, raVar.f55077b) && n6.l.k(null, null) && n6.l.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55076a, this.f55077b, null, null});
    }
}
