package z7;

import java.util.Arrays;
public final class i1 {
    public final ib f50919a;
    public final Boolean f50920b;
    public final xe f50921c;

    public i1(u2.c cVar) {
        this.f50919a = (ib) cVar.f47282b;
        this.f50920b = (Boolean) cVar.f47283c;
        this.f50921c = (xe) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50919a, i1Var.f50919a) && n6.l.l(this.f50920b, i1Var.f50920b) && n6.l.l(null, null) && n6.l.l(this.f50921c, i1Var.f50921c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50919a, this.f50920b, null, this.f50921c});
    }
}
