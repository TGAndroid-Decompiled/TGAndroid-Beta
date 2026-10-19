package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51168a;
    public final Integer f51169b;

    public sa(qa qaVar) {
        this.f51168a = (ra) qaVar.f51142a;
        this.f51169b = (Integer) qaVar.f51143b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51168a, saVar.f51168a) && n6.l.l(this.f51169b, saVar.f51169b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51168a, this.f51169b, null, null});
    }
}
