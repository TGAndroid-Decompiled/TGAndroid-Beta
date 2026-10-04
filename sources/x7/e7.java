package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49456a;
    public final Integer f49457b;

    public e7(o0.a aVar) {
        this.f49456a = (d7) aVar.f16927b;
        this.f49457b = (Integer) aVar.f16928c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49456a, e7Var.f49456a) && n6.l.l(this.f49457b, e7Var.f49457b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49456a, this.f49457b, null, null});
    }
}
