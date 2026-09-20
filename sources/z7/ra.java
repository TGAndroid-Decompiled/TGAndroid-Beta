package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48900a;
    public final Integer f48901b;

    public ra(org.telegram.ui.Cells.f3 f3Var) {
        this.f48900a = (qa) f3Var.f20269b;
        this.f48901b = (Integer) f3Var.f20270c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48900a, raVar.f48900a) && n6.l.l(this.f48901b, raVar.f48901b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48900a, this.f48901b, null, null});
    }
}
