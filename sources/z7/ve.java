package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51681a;
    public final Boolean f51682b;
    public final Boolean f51683c;
    public final Boolean d;
    public final Boolean e;

    public ve(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51681a = (Boolean) z5Var.f6893b;
        this.f51682b = (Boolean) z5Var.f6894c;
        this.f51683c = (Boolean) z5Var.f6892a;
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
        if (n6.l.l(this.f51681a, veVar.f51681a) && n6.l.l(this.f51682b, veVar.f51682b) && n6.l.l(this.f51683c, veVar.f51683c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51681a, this.f51682b, this.f51683c, this.d, this.e});
    }
}
