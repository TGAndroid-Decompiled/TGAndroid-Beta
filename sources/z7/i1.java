package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48739a;
    public final Boolean f48740b;
    public final ve f48741c;

    public i1(v7.r1 r1Var) {
        this.f48739a = (gb) r1Var.f44332b;
        this.f48740b = (Boolean) r1Var.d;
        this.f48741c = (ve) r1Var.f44333c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48739a, i1Var.f48739a) && n6.l.l(this.f48740b, i1Var.f48740b) && n6.l.l(null, null) && n6.l.l(this.f48741c, i1Var.f48741c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48739a, this.f48740b, null, this.f48741c});
    }
}
