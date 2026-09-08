package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49004a;
    public final Integer f49005b;

    public e7(o0.a aVar) {
        this.f49004a = (d7) aVar.f16796b;
        this.f49005b = (Integer) aVar.f16797c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49004a, e7Var.f49004a) && n6.l.l(this.f49005b, e7Var.f49005b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49004a, this.f49005b, null, null});
    }
}
