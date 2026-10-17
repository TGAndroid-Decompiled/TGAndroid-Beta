package z7;

import java.util.Arrays;
public final class xe {
    public final Boolean f51253a;
    public final Boolean f51254b;
    public final Boolean f51255c;
    public final Boolean d;
    public final Boolean e;

    public xe(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51253a = (Boolean) z5Var.f6883b;
        this.f51254b = (Boolean) z5Var.f6884c;
        this.f51255c = (Boolean) z5Var.f6882a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        if (n6.l.l(this.f51253a, xeVar.f51253a) && n6.l.l(this.f51254b, xeVar.f51254b) && n6.l.l(this.f51255c, xeVar.f51255c) && n6.l.l(this.d, xeVar.d) && n6.l.l(this.e, xeVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51253a, this.f51254b, this.f51255c, this.d, this.e});
    }
}
