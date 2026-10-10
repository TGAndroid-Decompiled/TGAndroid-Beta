package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54076a;
    public final Integer f54077b;

    public ra(org.telegram.ui.ActionBar.b5 b5Var) {
        this.f54076a = (qa) b5Var.f20465b;
        this.f54077b = (Integer) b5Var.f20466c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f54076a, raVar.f54076a) && n6.l.l(this.f54077b, raVar.f54077b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54076a, this.f54077b, null, null});
    }
}
