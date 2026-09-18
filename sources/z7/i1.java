package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48513a;
    public final Boolean f48514b;
    public final ve f48515c;

    public i1(v7.r1 r1Var) {
        this.f48513a = (gb) r1Var.f44106b;
        this.f48514b = (Boolean) r1Var.d;
        this.f48515c = (ve) r1Var.f44107c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48513a, i1Var.f48513a) && n6.l.l(this.f48514b, i1Var.f48514b) && n6.l.l(null, null) && n6.l.l(this.f48515c, i1Var.f48515c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48513a, this.f48514b, null, this.f48515c});
    }
}
