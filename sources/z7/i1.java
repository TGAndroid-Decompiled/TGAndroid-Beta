package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f52774a;
    public final Boolean f52775b;
    public final ve f52776c;

    public i1(v7.k kVar) {
        this.f52774a = (gb) kVar.f47977b;
        this.f52775b = (Boolean) kVar.f47978c;
        this.f52776c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f52774a, i1Var.f52774a) && n6.l.l(this.f52775b, i1Var.f52775b) && n6.l.l(null, null) && n6.l.l(this.f52776c, i1Var.f52776c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52774a, this.f52775b, null, this.f52776c});
    }
}
