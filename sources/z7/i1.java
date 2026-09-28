package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48756a;
    public final Boolean f48757b;
    public final ve f48758c;

    public i1(v7.l lVar) {
        this.f48756a = (gb) lVar.f44313b;
        this.f48757b = (Boolean) lVar.f44314c;
        this.f48758c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48756a, i1Var.f48756a) && n6.l.l(this.f48757b, i1Var.f48757b) && n6.l.l(null, null) && n6.l.l(this.f48758c, i1Var.f48758c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48756a, this.f48757b, null, this.f48758c});
    }
}
