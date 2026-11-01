package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f53155a;
    public final Integer f53156b;

    public e7(u9.b bVar) {
        this.f53155a = (d7) bVar.f50208b;
        this.f53156b = (Integer) bVar.f50209c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.k(this.f53155a, e7Var.f53155a) && n6.l.k(this.f53156b, e7Var.f53156b) && n6.l.k(null, null) && n6.l.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53155a, this.f53156b, null, null});
    }
}
