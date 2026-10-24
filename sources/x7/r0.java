package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49973a;
    public final Boolean f49974b;
    public final h8 f49975c;

    public r0(u2.c cVar) {
        this.f49973a = (n7) cVar.f47711b;
        this.f49974b = (Boolean) cVar.f47712c;
        this.f49975c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49973a, r0Var.f49973a) && n6.l.l(this.f49974b, r0Var.f49974b) && n6.l.l(null, null) && n6.l.l(this.f49975c, r0Var.f49975c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49973a, this.f49974b, null, this.f49975c});
    }
}
