package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f50748a;
    public final Integer f50749b;

    public e7(org.telegram.ui.ActionBar.b5 b5Var) {
        this.f50748a = (d7) b5Var.f20461b;
        this.f50749b = (Integer) b5Var.f20462c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f50748a, e7Var.f50748a) && n6.l.l(this.f50749b, e7Var.f50749b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50748a, this.f50749b, null, null});
    }
}
