package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51507a;
    public final Boolean f51508b;
    public final ve f51509c;

    public i1(u2.c cVar) {
        this.f51507a = (gb) cVar.f47711b;
        this.f51508b = (Boolean) cVar.f47712c;
        this.f51509c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51507a, i1Var.f51507a) && n6.l.l(this.f51508b, i1Var.f51508b) && n6.l.l(null, null) && n6.l.l(this.f51509c, i1Var.f51509c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51507a, this.f51508b, null, this.f51509c});
    }
}
