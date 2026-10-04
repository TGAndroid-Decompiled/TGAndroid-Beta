package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f52780a;
    public final Boolean f52781b;
    public final ve f52782c;

    public i1(v7.k kVar) {
        this.f52780a = (gb) kVar.f47986b;
        this.f52781b = (Boolean) kVar.f47987c;
        this.f52782c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f52780a, i1Var.f52780a) && n6.l.l(this.f52781b, i1Var.f52781b) && n6.l.l(null, null) && n6.l.l(this.f52782c, i1Var.f52782c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52780a, this.f52781b, null, this.f52782c});
    }
}
