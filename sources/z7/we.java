package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51266a;
    public final Boolean f51267b;
    public final Boolean f51268c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51266a = (Boolean) z5Var.f6884b;
        this.f51267b = (Boolean) z5Var.f6885c;
        this.f51268c = (Boolean) z5Var.f6883a;
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
        if (n6.l.l(this.f51266a, weVar.f51266a) && n6.l.l(this.f51267b, weVar.f51267b) && n6.l.l(this.f51268c, weVar.f51268c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51266a, this.f51267b, this.f51268c, this.d, this.e});
    }
}
