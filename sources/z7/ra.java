package z7;

import java.util.Arrays;
public final class ra {
    public final qa f52905a;
    public final Integer f52906b;

    public ra(n7.z0 z0Var) {
        this.f52905a = (qa) z0Var.f16851b;
        this.f52906b = (Integer) z0Var.f16852c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f52905a, raVar.f52905a) && n6.l.l(this.f52906b, raVar.f52906b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52905a, this.f52906b, null, null});
    }
}
