package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f48135a;
    public final Boolean f48136b;
    public final h8 f48137c;

    public r0(u2.c cVar) {
        this.f48135a = (n7) cVar.f45875b;
        this.f48136b = (Boolean) cVar.f45876c;
        this.f48137c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f48135a, r0Var.f48135a) && n6.l.l(this.f48136b, r0Var.f48136b) && n6.l.l(null, null) && n6.l.l(this.f48137c, r0Var.f48137c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48135a, this.f48136b, null, this.f48137c});
    }
}
