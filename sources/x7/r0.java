package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49544a;
    public final Boolean f49545b;
    public final h8 f49546c;

    public r0(u2.c cVar) {
        this.f49544a = (n7) cVar.f47282b;
        this.f49545b = (Boolean) cVar.f47283c;
        this.f49546c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49544a, r0Var.f49544a) && n6.l.l(this.f49545b, r0Var.f49545b) && n6.l.l(null, null) && n6.l.l(this.f49546c, r0Var.f49546c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49544a, this.f49545b, null, this.f49546c});
    }
}
