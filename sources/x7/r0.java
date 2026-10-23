package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49532a;
    public final Boolean f49533b;
    public final h8 f49534c;

    public r0(u2.c cVar) {
        this.f49532a = (n7) cVar.f47273b;
        this.f49533b = (Boolean) cVar.f47274c;
        this.f49534c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49532a, r0Var.f49532a) && n6.l.l(this.f49533b, r0Var.f49533b) && n6.l.l(null, null) && n6.l.l(this.f49534c, r0Var.f49534c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49532a, this.f49533b, null, this.f49534c});
    }
}
