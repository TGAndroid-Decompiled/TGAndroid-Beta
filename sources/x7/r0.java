package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f53302a;
    public final Boolean f53303b;
    public final i8 f53304c;

    public r0(q5.d dVar) {
        this.f53302a = (n7) dVar.f45487b;
        this.f53303b = (Boolean) dVar.f45488c;
        this.f53304c = (i8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.k(this.f53302a, r0Var.f53302a) && n6.l.k(this.f53303b, r0Var.f53303b) && n6.l.k(null, null) && n6.l.k(this.f53304c, r0Var.f53304c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53302a, this.f53303b, null, this.f53304c});
    }
}
