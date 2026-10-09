package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f54086a;
    public final Boolean f54087b;
    public final Boolean f54088c;
    public final Boolean d;
    public final Boolean f54089e;

    public ve(ci.u5 u5Var) {
        this.f54086a = (Boolean) u5Var.f6065a;
        this.f54087b = (Boolean) u5Var.f6066b;
        this.f54088c = (Boolean) u5Var.f6067c;
        this.d = (Boolean) u5Var.d;
        this.f54089e = (Boolean) u5Var.f6068e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f54086a, veVar.f54086a) && n6.l.l(this.f54087b, veVar.f54087b) && n6.l.l(this.f54088c, veVar.f54088c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f54089e, veVar.f54089e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54086a, this.f54087b, this.f54088c, this.d, this.f54089e});
    }
}
