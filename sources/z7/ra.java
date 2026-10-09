package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54032a;
    public final Integer f54033b;

    public ra(org.telegram.ui.ActionBar.b5 b5Var) {
        this.f54032a = (qa) b5Var.f20461b;
        this.f54033b = (Integer) b5Var.f20462c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f54032a, raVar.f54032a) && n6.l.l(this.f54033b, raVar.f54033b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54032a, this.f54033b, null, null});
    }
}
