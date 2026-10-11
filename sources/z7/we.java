package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f54189a;
    public final Boolean f54190b;
    public final Boolean f54191c;
    public final Boolean d;
    public final Boolean f54192e;

    public we(ci.u5 u5Var) {
        this.f54189a = (Boolean) u5Var.f6064a;
        this.f54190b = (Boolean) u5Var.f6065b;
        this.f54191c = (Boolean) u5Var.f6066c;
        this.d = (Boolean) u5Var.d;
        this.f54192e = (Boolean) u5Var.f6067e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.m.l(this.f54189a, weVar.f54189a) && n6.m.l(this.f54190b, weVar.f54190b) && n6.m.l(this.f54191c, weVar.f54191c) && n6.m.l(this.d, weVar.d) && n6.m.l(this.f54192e, weVar.f54192e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54189a, this.f54190b, this.f54191c, this.d, this.f54192e});
    }
}
