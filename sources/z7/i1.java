package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48758a;
    public final Boolean f48759b;
    public final ve f48760c;

    public i1(v7.l lVar) {
        this.f48758a = (gb) lVar.f44315b;
        this.f48759b = (Boolean) lVar.f44316c;
        this.f48760c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48758a, i1Var.f48758a) && n6.l.l(this.f48759b, i1Var.f48759b) && n6.l.l(null, null) && n6.l.l(this.f48760c, i1Var.f48760c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48758a, this.f48759b, null, this.f48760c});
    }
}
