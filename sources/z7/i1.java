package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48745a;
    public final Boolean f48746b;
    public final ve f48747c;

    public i1(v7.l lVar) {
        this.f48745a = (gb) lVar.f44299b;
        this.f48746b = (Boolean) lVar.f44300c;
        this.f48747c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48745a, i1Var.f48745a) && n6.l.l(this.f48746b, i1Var.f48746b) && n6.l.l(null, null) && n6.l.l(this.f48747c, i1Var.f48747c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48745a, this.f48746b, null, this.f48747c});
    }
}
