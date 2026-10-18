package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51213a;
    public final Integer f51214b;

    public sa(qa qaVar) {
        this.f51213a = (ra) qaVar.f51187a;
        this.f51214b = (Integer) qaVar.f51188b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51213a, saVar.f51213a) && n6.l.l(this.f51214b, saVar.f51214b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51213a, this.f51214b, null, null});
    }
}
