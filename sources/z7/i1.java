package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f52801a;
    public final Boolean f52802b;
    public final ve f52803c;

    public i1(v7.k kVar) {
        this.f52801a = (gb) kVar.f47993b;
        this.f52802b = (Boolean) kVar.f47994c;
        this.f52803c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f52801a, i1Var.f52801a) && n6.l.l(this.f52802b, i1Var.f52802b) && n6.l.l(null, null) && n6.l.l(this.f52803c, i1Var.f52803c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52801a, this.f52802b, null, this.f52803c});
    }
}
