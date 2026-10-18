package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49522a;
    public final Boolean f49523b;
    public final h8 f49524c;

    public r0(u2.c cVar) {
        this.f49522a = (n7) cVar.f47260b;
        this.f49523b = (Boolean) cVar.f47261c;
        this.f49524c = (h8) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49522a, r0Var.f49522a) && n6.l.l(this.f49523b, r0Var.f49523b) && n6.l.l(null, null) && n6.l.l(this.f49524c, r0Var.f49524c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49522a, this.f49523b, null, this.f49524c});
    }
}
