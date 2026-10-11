package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f54029a;
    public final Boolean f54030b;
    public final we f54031c;

    public i1(v7.k kVar) {
        this.f54029a = (gb) kVar.f49367b;
        this.f54030b = (Boolean) kVar.f49368c;
        this.f54031c = (we) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.m.l(this.f54029a, i1Var.f54029a) && n6.m.l(this.f54030b, i1Var.f54030b) && n6.m.l(null, null) && n6.m.l(this.f54031c, i1Var.f54031c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54029a, this.f54030b, null, this.f54031c});
    }
}
