package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49639a;
    public final Boolean f49640b;
    public final h8 f49641c;

    public r0(v7.k kVar) {
        this.f49639a = (n7) kVar.f47986b;
        this.f49640b = (Boolean) kVar.f47987c;
        this.f49641c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49639a, r0Var.f49639a) && n6.l.l(this.f49640b, r0Var.f49640b) && n6.l.l(null, null) && n6.l.l(this.f49641c, r0Var.f49641c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49639a, this.f49640b, null, this.f49641c});
    }
}
