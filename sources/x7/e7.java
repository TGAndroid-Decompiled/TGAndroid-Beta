package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49005a;
    public final Integer f49006b;

    public e7(o0.a aVar) {
        this.f49005a = (d7) aVar.f16796b;
        this.f49006b = (Integer) aVar.f16797c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49005a, e7Var.f49005a) && n6.l.l(this.f49006b, e7Var.f49006b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49005a, this.f49006b, null, null});
    }
}
