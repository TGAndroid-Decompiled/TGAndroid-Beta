package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50792a;
    public final Integer f50793b;

    public e7(org.telegram.ui.ActionBar.b5 b5Var) {
        this.f50792a = (d7) b5Var.f20465b;
        this.f50793b = (Integer) b5Var.f20466c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f50792a, e7Var.f50792a) && n6.l.l(this.f50793b, e7Var.f50793b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50792a, this.f50793b, null, null});
    }
}
