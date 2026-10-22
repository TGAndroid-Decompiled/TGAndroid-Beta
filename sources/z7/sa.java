package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51176a;
    public final Integer f51177b;

    public sa(qa qaVar) {
        this.f51176a = (ra) qaVar.f51150a;
        this.f51177b = (Integer) qaVar.f51151b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51176a, saVar.f51176a) && n6.l.l(this.f51177b, saVar.f51177b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51176a, this.f51177b, null, null});
    }
}
