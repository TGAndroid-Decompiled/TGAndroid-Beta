package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48785a;
    public final Boolean f48786b;
    public final ve f48787c;

    public i1(v7.s1 s1Var) {
        this.f48785a = (gb) s1Var.f44383b;
        this.f48786b = (Boolean) s1Var.d;
        this.f48787c = (ve) s1Var.f44384c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48785a, i1Var.f48785a) && n6.l.l(this.f48786b, i1Var.f48786b) && n6.l.l(null, null) && n6.l.l(this.f48787c, i1Var.f48787c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48785a, this.f48786b, null, this.f48787c});
    }
}
