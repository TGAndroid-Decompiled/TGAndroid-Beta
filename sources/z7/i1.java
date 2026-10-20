package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50908a;
    public final Boolean f50909b;
    public final we f50910c;

    public i1(u2.c cVar) {
        this.f50908a = (hb) cVar.f47269b;
        this.f50909b = (Boolean) cVar.f47270c;
        this.f50910c = (we) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50908a, i1Var.f50908a) && n6.l.l(this.f50909b, i1Var.f50909b) && n6.l.l(null, null) && n6.l.l(this.f50910c, i1Var.f50910c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50908a, this.f50909b, null, this.f50910c});
    }
}
