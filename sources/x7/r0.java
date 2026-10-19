package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49521a;
    public final Boolean f49522b;
    public final h8 f49523c;

    public r0(u2.c cVar) {
        this.f49521a = (n7) cVar.f47259b;
        this.f49522b = (Boolean) cVar.f47260c;
        this.f49523c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49521a, r0Var.f49521a) && n6.l.l(this.f49522b, r0Var.f49522b) && n6.l.l(null, null) && n6.l.l(this.f49523c, r0Var.f49523c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49521a, this.f49522b, null, this.f49523c});
    }
}
