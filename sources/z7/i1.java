package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50948a;
    public final Boolean f50949b;
    public final we f50950c;

    public i1(t0.h hVar) {
        this.f50948a = (hb) hVar.f46911b;
        this.f50949b = (Boolean) hVar.f46912c;
        this.f50950c = (we) hVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50948a, i1Var.f50948a) && n6.l.l(this.f50949b, i1Var.f50949b) && n6.l.l(null, null) && n6.l.l(this.f50950c, i1Var.f50950c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50948a, this.f50949b, null, this.f50950c});
    }
}
