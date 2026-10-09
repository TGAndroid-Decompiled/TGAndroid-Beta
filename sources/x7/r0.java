package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f50921a;
    public final Boolean f50922b;
    public final h8 f50923c;

    public r0(v7.k kVar) {
        this.f50921a = (n7) kVar.f49244b;
        this.f50922b = (Boolean) kVar.f49245c;
        this.f50923c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f50921a, r0Var.f50921a) && n6.l.l(this.f50922b, r0Var.f50922b) && n6.l.l(null, null) && n6.l.l(this.f50923c, r0Var.f50923c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50921a, this.f50922b, null, this.f50923c});
    }
}
