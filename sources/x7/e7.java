package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49465a;
    public final Integer f49466b;

    public e7(o0.a aVar) {
        this.f49465a = (d7) aVar.f16932b;
        this.f49466b = (Integer) aVar.f16933c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49465a, e7Var.f49465a) && n6.l.l(this.f49466b, e7Var.f49466b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49465a, this.f49466b, null, null});
    }
}
