package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f53995a;
    public final Boolean f53996b;
    public final we f53997c;

    public i1(v7.k kVar) {
        this.f53995a = (gb) kVar.f49333b;
        this.f53996b = (Boolean) kVar.f49334c;
        this.f53997c = (we) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.m.l(this.f53995a, i1Var.f53995a) && n6.m.l(this.f53996b, i1Var.f53996b) && n6.m.l(null, null) && n6.m.l(this.f53997c, i1Var.f53997c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53995a, this.f53996b, null, this.f53997c});
    }
}
