package y7;

import java.util.Arrays;
public final class q0 {
    public final l7 f52265a;
    public final Boolean f52266b;
    public final f8 f52267c;

    public q0(s4.d dVar) {
        this.f52265a = (l7) dVar.f47717b;
        this.f52266b = (Boolean) dVar.f47718c;
        this.f52267c = (f8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (o6.l.l(this.f52265a, q0Var.f52265a) && o6.l.l(this.f52266b, q0Var.f52266b) && o6.l.l(null, null) && o6.l.l(this.f52267c, q0Var.f52267c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52265a, this.f52266b, null, this.f52267c});
    }
}
