package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f47770a;
    public final Boolean f47771b;
    public final Boolean f47772c;
    public final Boolean d;
    public final Boolean e;

    public ve(bi.u6 u6Var) {
        this.f47770a = (Boolean) u6Var.f3719a;
        this.f47771b = (Boolean) u6Var.f3720b;
        this.f47772c = (Boolean) u6Var.f3721c;
        this.d = (Boolean) u6Var.d;
        this.e = (Boolean) u6Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f47770a, veVar.f47770a) && n6.l.l(this.f47771b, veVar.f47771b) && n6.l.l(this.f47772c, veVar.f47772c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47770a, this.f47771b, this.f47772c, this.d, this.e});
    }
}
