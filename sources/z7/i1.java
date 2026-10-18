package z7;

import java.util.Arrays;
public final class i1 {
    public final hb f50901a;
    public final Boolean f50902b;
    public final we f50903c;

    public i1(u2.c cVar) {
        this.f50901a = (hb) cVar.f47260b;
        this.f50902b = (Boolean) cVar.f47261c;
        this.f50903c = (we) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f50901a, i1Var.f50901a) && n6.l.l(this.f50902b, i1Var.f50902b) && n6.l.l(null, null) && n6.l.l(this.f50903c, i1Var.f50903c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50901a, this.f50902b, null, this.f50903c});
    }
}
