package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f53951a;
    public final Boolean f53952b;
    public final ve f53953c;

    public i1(v7.k kVar) {
        this.f53951a = (gb) kVar.f49290b;
        this.f53952b = (Boolean) kVar.f49291c;
        this.f53953c = (ve) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f53951a, i1Var.f53951a) && n6.l.l(this.f53952b, i1Var.f53952b) && n6.l.l(null, null) && n6.l.l(this.f53953c, i1Var.f53953c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53951a, this.f53952b, null, this.f53953c});
    }
}
