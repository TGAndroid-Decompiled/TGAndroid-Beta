package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f54326a;
    public final Boolean f54327b;
    public final Boolean f54328c;
    public final Boolean d;
    public final Boolean f54329e;

    public we(ci.u5 u5Var) {
        this.f54326a = (Boolean) u5Var.f6063a;
        this.f54327b = (Boolean) u5Var.f6064b;
        this.f54328c = (Boolean) u5Var.f6065c;
        this.d = (Boolean) u5Var.d;
        this.f54329e = (Boolean) u5Var.f6066e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.m.l(this.f54326a, weVar.f54326a) && n6.m.l(this.f54327b, weVar.f54327b) && n6.m.l(this.f54328c, weVar.f54328c) && n6.m.l(this.d, weVar.d) && n6.m.l(this.f54329e, weVar.f54329e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54326a, this.f54327b, this.f54328c, this.d, this.f54329e});
    }
}
