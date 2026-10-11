package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f51045a;
    public final Boolean f51046b;
    public final h8 f51047c;

    public r0(v7.k kVar) {
        this.f51045a = (n7) kVar.f49367b;
        this.f51046b = (Boolean) kVar.f49368c;
        this.f51047c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.m.l(this.f51045a, r0Var.f51045a) && n6.m.l(this.f51046b, r0Var.f51046b) && n6.m.l(null, null) && n6.m.l(this.f51047c, r0Var.f51047c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51045a, this.f51046b, null, this.f51047c});
    }
}
