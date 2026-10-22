package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49531a;
    public final Boolean f49532b;
    public final h8 f49533c;

    public r0(u2.c cVar) {
        this.f49531a = (n7) cVar.f47272b;
        this.f49532b = (Boolean) cVar.f47273c;
        this.f49533c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49531a, r0Var.f49531a) && n6.l.l(this.f49532b, r0Var.f49532b) && n6.l.l(null, null) && n6.l.l(this.f49533c, r0Var.f49533c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49531a, this.f49532b, null, this.f49533c});
    }
}
