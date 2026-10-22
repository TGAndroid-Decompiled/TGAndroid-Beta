package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50911a;
    public final Boolean f50912b;
    public final we f50913c;

    public i1(u2.c cVar) {
        this.f50911a = (hb) cVar.f47272b;
        this.f50912b = (Boolean) cVar.f47273c;
        this.f50913c = (we) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50911a, i1Var.f50911a) && n6.l.l(this.f50912b, i1Var.f50912b) && n6.l.l(null, null) && n6.l.l(this.f50913c, i1Var.f50913c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50911a, this.f50912b, null, this.f50913c});
    }
}
