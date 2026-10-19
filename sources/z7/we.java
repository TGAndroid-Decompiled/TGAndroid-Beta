package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51221a;
    public final Boolean f51222b;
    public final Boolean f51223c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51221a = (Boolean) z5Var.f6881b;
        this.f51222b = (Boolean) z5Var.f6882c;
        this.f51223c = (Boolean) z5Var.f6880a;
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
        if (n6.l.l(this.f51221a, weVar.f51221a) && n6.l.l(this.f51222b, weVar.f51222b) && n6.l.l(this.f51223c, weVar.f51223c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51221a, this.f51222b, this.f51223c, this.d, this.e});
    }
}
