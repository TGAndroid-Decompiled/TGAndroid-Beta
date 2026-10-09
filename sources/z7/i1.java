package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f53907a;
    public final Boolean f53908b;
    public final ve f53909c;

    public i1(v7.k kVar) {
        this.f53907a = (gb) kVar.f49246b;
        this.f53908b = (Boolean) kVar.f49247c;
        this.f53909c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f53907a, i1Var.f53907a) && n6.l.l(this.f53908b, i1Var.f53908b) && n6.l.l(null, null) && n6.l.l(this.f53909c, i1Var.f53909c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53907a, this.f53908b, null, this.f53909c});
    }
}
