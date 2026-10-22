package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51229a;
    public final Boolean f51230b;
    public final Boolean f51231c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51229a = (Boolean) z5Var.f6881b;
        this.f51230b = (Boolean) z5Var.f6882c;
        this.f51231c = (Boolean) z5Var.f6880a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.l.l(this.f51229a, weVar.f51229a) && n6.l.l(this.f51230b, weVar.f51230b) && n6.l.l(this.f51231c, weVar.f51231c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51229a, this.f51230b, this.f51231c, this.d, this.e});
    }
}
