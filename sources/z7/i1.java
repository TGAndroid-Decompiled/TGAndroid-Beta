package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f53905a;
    public final Boolean f53906b;
    public final ve f53907c;

    public i1(v7.k kVar) {
        this.f53905a = (gb) kVar.f49244b;
        this.f53906b = (Boolean) kVar.f49245c;
        this.f53907c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f53905a, i1Var.f53905a) && n6.l.l(this.f53906b, i1Var.f53906b) && n6.l.l(null, null) && n6.l.l(this.f53907c, i1Var.f53907c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53905a, this.f53906b, null, this.f53907c});
    }
}
