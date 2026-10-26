package y7;

import java.util.Arrays;
public final class c7 {
    public final b7 f52096a;
    public final Integer f52097b;

    public c7(m4.c cVar) {
        this.f52096a = (b7) cVar.f18009b;
        this.f52097b = (Integer) cVar.f18010c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        if (o6.l.l(this.f52096a, c7Var.f52096a) && o6.l.l(this.f52097b, c7Var.f52097b) && o6.l.l(null, null) && o6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52096a, this.f52097b, null, null});
    }
}
