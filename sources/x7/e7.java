package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f53137a;
    public final Integer f53138b;

    public e7(u9.b bVar) {
        this.f53137a = (d7) bVar.f50194b;
        this.f53138b = (Integer) bVar.f50195c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.k(this.f53137a, e7Var.f53137a) && n6.l.k(this.f53138b, e7Var.f53138b) && n6.l.k(null, null) && n6.l.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53137a, this.f53138b, null, null});
    }
}
