package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48920a;
    public final Integer f48921b;

    public ra(org.telegram.ui.Cells.f3 f3Var) {
        this.f48920a = (qa) f3Var.f20284b;
        this.f48921b = (Integer) f3Var.f20285c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48920a, raVar.f48920a) && n6.l.l(this.f48921b, raVar.f48921b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48920a, this.f48921b, null, null});
    }
}
