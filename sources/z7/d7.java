package z7;

import java.util.Arrays;
public final class d7 {
    public final c7 f59837a;
    public final Integer f59838b;

    public d7(w9.b bVar) {
        this.f59837a = (c7) bVar.f57424b;
        this.f59838b = (Integer) bVar.f57425c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        if (p6.m.k(this.f59837a, d7Var.f59837a) && p6.m.k(this.f59838b, d7Var.f59838b) && p6.m.k(null, null) && p6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59837a, this.f59838b, null, null});
    }
}
