package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f54334a;
    public final Boolean f54335b;
    public final Boolean f54336c;
    public final Boolean d;
    public final Boolean f54337e;

    public we(ci.u5 u5Var) {
        this.f54334a = (Boolean) u5Var.f6063a;
        this.f54335b = (Boolean) u5Var.f6064b;
        this.f54336c = (Boolean) u5Var.f6065c;
        this.d = (Boolean) u5Var.d;
        this.f54337e = (Boolean) u5Var.f6066e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.m.l(this.f54334a, weVar.f54334a) && n6.m.l(this.f54335b, weVar.f54335b) && n6.m.l(this.f54336c, weVar.f54336c) && n6.m.l(this.d, weVar.d) && n6.m.l(this.f54337e, weVar.f54337e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54334a, this.f54335b, this.f54336c, this.d, this.f54337e});
    }
}
