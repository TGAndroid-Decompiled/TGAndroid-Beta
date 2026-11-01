package z7;

import java.util.Arrays;
public final class ra {
    public final qa f55094a;
    public final Integer f55095b;

    public ra(x7.g8 g8Var) {
        this.f55094a = (qa) g8Var.f53182b;
        this.f55095b = (Integer) g8Var.f53183c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.k(this.f55094a, raVar.f55094a) && n6.l.k(this.f55095b, raVar.f55095b) && n6.l.k(null, null) && n6.l.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55094a, this.f55095b, null, null});
    }
}
