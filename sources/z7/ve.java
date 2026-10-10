package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f54132a;
    public final Boolean f54133b;
    public final Boolean f54134c;
    public final Boolean d;
    public final Boolean f54135e;

    public ve(ci.u5 u5Var) {
        this.f54132a = (Boolean) u5Var.f6065a;
        this.f54133b = (Boolean) u5Var.f6066b;
        this.f54134c = (Boolean) u5Var.f6067c;
        this.d = (Boolean) u5Var.d;
        this.f54135e = (Boolean) u5Var.f6068e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f54132a, veVar.f54132a) && n6.l.l(this.f54133b, veVar.f54133b) && n6.l.l(this.f54134c, veVar.f54134c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f54135e, veVar.f54135e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54132a, this.f54133b, this.f54134c, this.d, this.f54135e});
    }
}
