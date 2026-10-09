package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f54088a;
    public final Boolean f54089b;
    public final Boolean f54090c;
    public final Boolean d;
    public final Boolean f54091e;

    public ve(ci.u5 u5Var) {
        this.f54088a = (Boolean) u5Var.f6065a;
        this.f54089b = (Boolean) u5Var.f6066b;
        this.f54090c = (Boolean) u5Var.f6067c;
        this.d = (Boolean) u5Var.d;
        this.f54091e = (Boolean) u5Var.f6068e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f54088a, veVar.f54088a) && n6.l.l(this.f54089b, veVar.f54089b) && n6.l.l(this.f54090c, veVar.f54090c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f54091e, veVar.f54091e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54088a, this.f54089b, this.f54090c, this.d, this.f54091e});
    }
}
