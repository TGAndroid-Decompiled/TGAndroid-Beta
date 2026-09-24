package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45830a;
    public final Boolean f45831b;
    public final h8 f45832c;

    public r0(v7.l lVar) {
        this.f45830a = (n7) lVar.f44299b;
        this.f45831b = (Boolean) lVar.f44300c;
        this.f45832c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45830a, r0Var.f45830a) && n6.l.l(this.f45831b, r0Var.f45831b) && n6.l.l(null, null) && n6.l.l(this.f45832c, r0Var.f45832c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45830a, this.f45831b, null, this.f45832c});
    }
}
