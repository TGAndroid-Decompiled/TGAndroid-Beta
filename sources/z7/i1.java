package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f54132a;
    public final Boolean f54133b;
    public final we f54134c;

    public i1(v7.k kVar) {
        this.f54132a = (gb) kVar.f49474b;
        this.f54133b = (Boolean) kVar.f49475c;
        this.f54134c = (we) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.m.l(this.f54132a, i1Var.f54132a) && n6.m.l(this.f54133b, i1Var.f54133b) && n6.m.l(null, null) && n6.m.l(this.f54134c, i1Var.f54134c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54132a, this.f54133b, null, this.f54134c});
    }
}
