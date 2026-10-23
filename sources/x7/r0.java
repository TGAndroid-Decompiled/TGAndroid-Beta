package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49974a;
    public final Boolean f49975b;
    public final h8 f49976c;

    public r0(u2.c cVar) {
        this.f49974a = (n7) cVar.f47712b;
        this.f49975b = (Boolean) cVar.f47713c;
        this.f49976c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49974a, r0Var.f49974a) && n6.l.l(this.f49975b, r0Var.f49975b) && n6.l.l(null, null) && n6.l.l(this.f49976c, r0Var.f49976c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49974a, this.f49975b, null, this.f49976c});
    }
}
