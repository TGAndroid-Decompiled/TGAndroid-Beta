package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f53320a;
    public final Boolean f53321b;
    public final i8 f53322c;

    public r0(q5.d dVar) {
        this.f53320a = (n7) dVar.f45498b;
        this.f53321b = (Boolean) dVar.f45499c;
        this.f53322c = (i8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.k(this.f53320a, r0Var.f53320a) && n6.l.k(this.f53321b, r0Var.f53321b) && n6.l.k(null, null) && n6.l.k(this.f53322c, r0Var.f53322c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53320a, this.f53321b, null, this.f53322c});
    }
}
