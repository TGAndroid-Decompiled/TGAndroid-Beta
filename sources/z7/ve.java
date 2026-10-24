package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51680a;
    public final Boolean f51681b;
    public final Boolean f51682c;
    public final Boolean d;
    public final Boolean e;

    public ve(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51680a = (Boolean) z5Var.f6893b;
        this.f51681b = (Boolean) z5Var.f6894c;
        this.f51682c = (Boolean) z5Var.f6892a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f51680a, veVar.f51680a) && n6.l.l(this.f51681b, veVar.f51681b) && n6.l.l(this.f51682c, veVar.f51682c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51680a, this.f51681b, this.f51682c, this.d, this.e});
    }
}
