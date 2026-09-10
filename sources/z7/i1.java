package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f47601a;
    public final Boolean f47602b;
    public final ve f47603c;

    public i1(v7.a6 a6Var) {
        this.f47601a = (gb) a6Var.f42934b;
        this.f47602b = (Boolean) a6Var.d;
        this.f47603c = (ve) a6Var.f42935c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f47601a, i1Var.f47601a) && n6.l.l(this.f47602b, i1Var.f47602b) && n6.l.l(null, null) && n6.l.l(this.f47603c, i1Var.f47603c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47601a, this.f47602b, null, this.f47603c});
    }
}
