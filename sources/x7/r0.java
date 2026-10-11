package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f51011a;
    public final Boolean f51012b;
    public final h8 f51013c;

    public r0(v7.k kVar) {
        this.f51011a = (n7) kVar.f49333b;
        this.f51012b = (Boolean) kVar.f49334c;
        this.f51013c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.m.l(this.f51011a, r0Var.f51011a) && n6.m.l(this.f51012b, r0Var.f51012b) && n6.m.l(null, null) && n6.m.l(this.f51013c, r0Var.f51013c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51011a, this.f51012b, null, this.f51013c});
    }
}
