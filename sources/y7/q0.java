package y7;

import java.util.Arrays;
public final class q0 {
    public final l7 f52326a;
    public final Boolean f52327b;
    public final f8 f52328c;

    public q0(s4.d dVar) {
        this.f52326a = (l7) dVar.f47755b;
        this.f52327b = (Boolean) dVar.f47756c;
        this.f52328c = (f8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (o6.l.l(this.f52326a, q0Var.f52326a) && o6.l.l(this.f52327b, q0Var.f52327b) && o6.l.l(null, null) && o6.l.l(this.f52328c, q0Var.f52328c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52326a, this.f52327b, null, this.f52328c});
    }
}
