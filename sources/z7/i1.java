package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48800a;
    public final Boolean f48801b;
    public final ve f48802c;

    public i1(v7.k kVar) {
        this.f48800a = (gb) kVar.f44349b;
        this.f48801b = (Boolean) kVar.f44350c;
        this.f48802c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48800a, i1Var.f48800a) && n6.l.l(this.f48801b, i1Var.f48801b) && n6.l.l(null, null) && n6.l.l(this.f48802c, i1Var.f48802c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48800a, this.f48801b, null, this.f48802c});
    }
}
