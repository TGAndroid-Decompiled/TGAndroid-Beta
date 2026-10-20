package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49528a;
    public final Boolean f49529b;
    public final h8 f49530c;

    public r0(u2.c cVar) {
        this.f49528a = (n7) cVar.f47269b;
        this.f49529b = (Boolean) cVar.f47270c;
        this.f49530c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49528a, r0Var.f49528a) && n6.l.l(this.f49529b, r0Var.f49529b) && n6.l.l(null, null) && n6.l.l(this.f49530c, r0Var.f49530c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49528a, this.f49529b, null, this.f49530c});
    }
}
