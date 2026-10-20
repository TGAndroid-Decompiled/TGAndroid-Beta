package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51226a;
    public final Boolean f51227b;
    public final Boolean f51228c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51226a = (Boolean) z5Var.f6881b;
        this.f51227b = (Boolean) z5Var.f6882c;
        this.f51228c = (Boolean) z5Var.f6880a;
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
        if (n6.l.l(this.f51226a, weVar.f51226a) && n6.l.l(this.f51227b, weVar.f51227b) && n6.l.l(this.f51228c, weVar.f51228c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51226a, this.f51227b, this.f51228c, this.d, this.e});
    }
}
