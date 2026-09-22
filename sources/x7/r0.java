package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45562a;
    public final Boolean f45563b;
    public final h8 f45564c;

    public r0(v7.r1 r1Var) {
        this.f45562a = (n7) r1Var.f44074b;
        this.f45563b = (Boolean) r1Var.d;
        this.f45564c = (h8) r1Var.f44075c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45562a, r0Var.f45562a) && n6.l.l(this.f45563b, r0Var.f45563b) && n6.l.l(null, null) && n6.l.l(this.f45564c, r0Var.f45564c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45562a, this.f45563b, null, this.f45564c});
    }
}
