package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f52775a;
    public final Boolean f52776b;
    public final ve f52777c;

    public i1(v7.k kVar) {
        this.f52775a = (gb) kVar.f47978b;
        this.f52776b = (Boolean) kVar.f47979c;
        this.f52777c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f52775a, i1Var.f52775a) && n6.l.l(this.f52776b, i1Var.f52776b) && n6.l.l(null, null) && n6.l.l(this.f52777c, i1Var.f52777c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52775a, this.f52776b, null, this.f52777c});
    }
}
