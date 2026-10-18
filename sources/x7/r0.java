package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49569a;
    public final Boolean f49570b;
    public final h8 f49571c;

    public r0(t0.h hVar) {
        this.f49569a = (n7) hVar.f46911b;
        this.f49570b = (Boolean) hVar.f46912c;
        this.f49571c = (h8) hVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49569a, r0Var.f49569a) && n6.l.l(this.f49570b, r0Var.f49570b) && n6.l.l(null, null) && n6.l.l(this.f49571c, r0Var.f49571c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49569a, this.f49570b, null, this.f49571c});
    }
}
