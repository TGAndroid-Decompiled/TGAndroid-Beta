package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48755a;
    public final Boolean f48756b;
    public final ve f48757c;

    public i1(v7.l lVar) {
        this.f48755a = (gb) lVar.f44312b;
        this.f48756b = (Boolean) lVar.f44313c;
        this.f48757c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48755a, i1Var.f48755a) && n6.l.l(this.f48756b, i1Var.f48756b) && n6.l.l(null, null) && n6.l.l(this.f48757c, i1Var.f48757c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48755a, this.f48756b, null, this.f48757c});
    }
}
