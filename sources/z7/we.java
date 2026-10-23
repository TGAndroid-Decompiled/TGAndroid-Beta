package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51230a;
    public final Boolean f51231b;
    public final Boolean f51232c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51230a = (Boolean) z5Var.f6881b;
        this.f51231b = (Boolean) z5Var.f6882c;
        this.f51232c = (Boolean) z5Var.f6880a;
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
        if (n6.l.l(this.f51230a, weVar.f51230a) && n6.l.l(this.f51231b, weVar.f51231b) && n6.l.l(this.f51232c, weVar.f51232c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51230a, this.f51231b, this.f51232c, this.d, this.e});
    }
}
