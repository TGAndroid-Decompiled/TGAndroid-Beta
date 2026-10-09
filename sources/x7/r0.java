package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f50923a;
    public final Boolean f50924b;
    public final h8 f50925c;

    public r0(v7.k kVar) {
        this.f50923a = (n7) kVar.f49246b;
        this.f50924b = (Boolean) kVar.f49247c;
        this.f50925c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f50923a, r0Var.f50923a) && n6.l.l(this.f50924b, r0Var.f50924b) && n6.l.l(null, null) && n6.l.l(this.f50925c, r0Var.f50925c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50923a, this.f50924b, null, this.f50925c});
    }
}
