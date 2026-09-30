package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f48864a;
    public final Boolean f48865b;
    public final ve f48866c;

    public i1(v7.l lVar) {
        this.f48864a = (gb) lVar.f44421b;
        this.f48865b = (Boolean) lVar.f44422c;
        this.f48866c = (ve) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f48864a, i1Var.f48864a) && n6.l.l(this.f48865b, i1Var.f48865b) && n6.l.l(null, null) && n6.l.l(this.f48866c, i1Var.f48866c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48864a, this.f48865b, null, this.f48866c});
    }
}
