package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48757a;
    public final Boolean f48758b;
    public final ve f48759c;

    public i1(v7.l lVar) {
        this.f48757a = (gb) lVar.f44314b;
        this.f48758b = (Boolean) lVar.f44315c;
        this.f48759c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48757a, i1Var.f48757a) && n6.l.l(this.f48758b, i1Var.f48758b) && n6.l.l(null, null) && n6.l.l(this.f48759c, i1Var.f48759c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48757a, this.f48758b, null, this.f48759c});
    }
}
