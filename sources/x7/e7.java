package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f47976a;
    public final Integer f47977b;

    public e7(m4.c cVar) {
        this.f47976a = (d7) cVar.f15392b;
        this.f47977b = (Integer) cVar.f15393c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f47976a, e7Var.f47976a) && n6.l.l(this.f47977b, e7Var.f47977b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47976a, this.f47977b, null, null});
    }
}
