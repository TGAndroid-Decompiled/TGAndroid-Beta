package x7;

import java.util.Arrays;
public final class e7 {
    public final d7 f49814a;
    public final Integer f49815b;

    public e7(mi.q qVar) {
        this.f49814a = (d7) qVar.f17036b;
        this.f49815b = (Integer) qVar.f17037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (n6.l.l(this.f49814a, e7Var.f49814a) && n6.l.l(this.f49815b, e7Var.f49815b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49814a, this.f49815b, null, null});
    }
}
