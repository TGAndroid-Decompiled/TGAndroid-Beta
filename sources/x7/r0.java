package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f51160a;
    public final Boolean f51161b;
    public final h8 f51162c;

    public r0(v7.k kVar) {
        this.f51160a = (n7) kVar.f49482b;
        this.f51161b = (Boolean) kVar.f49483c;
        this.f51162c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.m.l(this.f51160a, r0Var.f51160a) && n6.m.l(this.f51161b, r0Var.f51161b) && n6.m.l(null, null) && n6.m.l(this.f51162c, r0Var.f51162c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51160a, this.f51161b, null, this.f51162c});
    }
}
