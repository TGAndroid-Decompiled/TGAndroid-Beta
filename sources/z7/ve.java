package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f49826a;
    public final Boolean f49827b;
    public final Boolean f49828c;
    public final Boolean d;
    public final Boolean e;

    public ve(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f49826a = (Boolean) z5Var.f5429b;
        this.f49827b = (Boolean) z5Var.f5430c;
        this.f49828c = (Boolean) z5Var.f5428a;
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
        if (n6.l.l(this.f49826a, veVar.f49826a) && n6.l.l(this.f49827b, veVar.f49827b) && n6.l.l(this.f49828c, veVar.f49828c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49826a, this.f49827b, this.f49828c, this.d, this.e});
    }
}
