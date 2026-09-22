package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48805a;
    public final Boolean f48806b;
    public final ve f48807c;

    public i1(v7.s1 s1Var) {
        this.f48805a = (gb) s1Var.f44405b;
        this.f48806b = (Boolean) s1Var.d;
        this.f48807c = (ve) s1Var.f44406c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48805a, i1Var.f48805a) && n6.l.l(this.f48806b, i1Var.f48806b) && n6.l.l(null, null) && n6.l.l(this.f48807c, i1Var.f48807c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48805a, this.f48806b, null, this.f48807c});
    }
}
