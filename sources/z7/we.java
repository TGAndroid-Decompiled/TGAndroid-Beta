package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f54223a;
    public final Boolean f54224b;
    public final Boolean f54225c;
    public final Boolean d;
    public final Boolean f54226e;

    public we(ci.u5 u5Var) {
        this.f54223a = (Boolean) u5Var.f6064a;
        this.f54224b = (Boolean) u5Var.f6065b;
        this.f54225c = (Boolean) u5Var.f6066c;
        this.d = (Boolean) u5Var.d;
        this.f54226e = (Boolean) u5Var.f6067e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.m.l(this.f54223a, weVar.f54223a) && n6.m.l(this.f54224b, weVar.f54224b) && n6.m.l(this.f54225c, weVar.f54225c) && n6.m.l(this.d, weVar.d) && n6.m.l(this.f54226e, weVar.f54226e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54223a, this.f54224b, this.f54225c, this.d, this.f54226e});
    }
}
