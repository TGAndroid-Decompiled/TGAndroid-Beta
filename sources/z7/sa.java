package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51173a;
    public final Integer f51174b;

    public sa(qa qaVar) {
        this.f51173a = (ra) qaVar.f51147a;
        this.f51174b = (Integer) qaVar.f51148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51173a, saVar.f51173a) && n6.l.l(this.f51174b, saVar.f51174b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51173a, this.f51174b, null, null});
    }
}
