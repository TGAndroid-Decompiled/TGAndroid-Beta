package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f51508a;
    public final Boolean f51509b;
    public final ve f51510c;

    public i1(u2.c cVar) {
        this.f51508a = (gb) cVar.f47712b;
        this.f51509b = (Boolean) cVar.f47713c;
        this.f51510c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f51508a, i1Var.f51508a) && n6.l.l(this.f51509b, i1Var.f51509b) && n6.l.l(null, null) && n6.l.l(this.f51510c, i1Var.f51510c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51508a, this.f51509b, null, this.f51510c});
    }
}
