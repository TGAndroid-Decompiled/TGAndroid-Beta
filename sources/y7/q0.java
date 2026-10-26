package y7;

import java.util.Arrays;
public final class q0 {
    public final l7 f52268a;
    public final Boolean f52269b;
    public final f8 f52270c;

    public q0(s4.d dVar) {
        this.f52268a = (l7) dVar.f47720b;
        this.f52269b = (Boolean) dVar.f47721c;
        this.f52270c = (f8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (o6.l.l(this.f52268a, q0Var.f52268a) && o6.l.l(this.f52269b, q0Var.f52269b) && o6.l.l(null, null) && o6.l.l(this.f52270c, q0Var.f52270c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52268a, this.f52269b, null, this.f52270c});
    }
}
