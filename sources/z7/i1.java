package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50903a;
    public final Boolean f50904b;
    public final we f50905c;

    public i1(u2.c cVar) {
        this.f50903a = (hb) cVar.f47261b;
        this.f50904b = (Boolean) cVar.f47262c;
        this.f50905c = (we) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50903a, i1Var.f50903a) && n6.l.l(this.f50904b, i1Var.f50904b) && n6.l.l(null, null) && n6.l.l(this.f50905c, i1Var.f50905c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50903a, this.f50904b, null, this.f50905c});
    }
}
