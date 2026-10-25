package y7;

import java.util.Arrays;
public final class c7 {
    public final b7 f52093a;
    public final Integer f52094b;

    public c7(m4.c cVar) {
        this.f52093a = (b7) cVar.f18009b;
        this.f52094b = (Integer) cVar.f18010c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        if (o6.l.l(this.f52093a, c7Var.f52093a) && o6.l.l(this.f52094b, c7Var.f52094b) && o6.l.l(null, null) && o6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52093a, this.f52094b, null, null});
    }
}
