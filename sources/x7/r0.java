package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49523a;
    public final Boolean f49524b;
    public final h8 f49525c;

    public r0(u2.c cVar) {
        this.f49523a = (n7) cVar.f47261b;
        this.f49524b = (Boolean) cVar.f47262c;
        this.f49525c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49523a, r0Var.f49523a) && n6.l.l(this.f49524b, r0Var.f49524b) && n6.l.l(null, null) && n6.l.l(this.f49525c, r0Var.f49525c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49523a, this.f49524b, null, this.f49525c});
    }
}
