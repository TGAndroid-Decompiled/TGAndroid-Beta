package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51166a;
    public final Integer f51167b;

    public sa(qa qaVar) {
        this.f51166a = (ra) qaVar.f51140a;
        this.f51167b = (Integer) qaVar.f51141b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51166a, saVar.f51166a) && n6.l.l(this.f51167b, saVar.f51167b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51166a, this.f51167b, null, null});
    }
}
