package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f49653a;
    public final Boolean f49654b;
    public final ve f49655c;

    public i1(u2.c cVar) {
        this.f49653a = (gb) cVar.f45875b;
        this.f49654b = (Boolean) cVar.f45876c;
        this.f49655c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f49653a, i1Var.f49653a) && n6.l.l(this.f49654b, i1Var.f49654b) && n6.l.l(null, null) && n6.l.l(this.f49655c, i1Var.f49655c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49653a, this.f49654b, null, this.f49655c});
    }
}
