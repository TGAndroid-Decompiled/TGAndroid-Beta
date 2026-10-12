package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f54140a;
    public final Boolean f54141b;
    public final we f54142c;

    public i1(v7.k kVar) {
        this.f54140a = (gb) kVar.f49482b;
        this.f54141b = (Boolean) kVar.f49483c;
        this.f54142c = (we) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.m.l(this.f54140a, i1Var.f54140a) && n6.m.l(this.f54141b, i1Var.f54141b) && n6.m.l(null, null) && n6.m.l(this.f54142c, i1Var.f54142c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54140a, this.f54141b, null, this.f54142c});
    }
}
