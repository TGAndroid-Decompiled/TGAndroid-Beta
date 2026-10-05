package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49646a;
    public final Boolean f49647b;
    public final h8 f49648c;

    public r0(v7.k kVar) {
        this.f49646a = (n7) kVar.f47993b;
        this.f49647b = (Boolean) kVar.f47994c;
        this.f49648c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49646a, r0Var.f49646a) && n6.l.l(this.f49647b, r0Var.f49647b) && n6.l.l(null, null) && n6.l.l(this.f49648c, r0Var.f49648c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49646a, this.f49647b, null, this.f49648c});
    }
}
