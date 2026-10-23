package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50912a;
    public final Boolean f50913b;
    public final we f50914c;

    public i1(u2.c cVar) {
        this.f50912a = (hb) cVar.f47273b;
        this.f50913b = (Boolean) cVar.f47274c;
        this.f50914c = (we) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50912a, i1Var.f50912a) && n6.l.l(this.f50913b, i1Var.f50913b) && n6.l.l(null, null) && n6.l.l(this.f50914c, i1Var.f50914c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50912a, this.f50913b, null, this.f50914c});
    }
}
