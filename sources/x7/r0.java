package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49179a;
    public final Boolean f49180b;
    public final h8 f49181c;

    public r0(v7.a6 a6Var) {
        this.f49179a = (n7) a6Var.f47407b;
        this.f49180b = (Boolean) a6Var.d;
        this.f49181c = (h8) a6Var.f47408c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49179a, r0Var.f49179a) && n6.l.l(this.f49180b, r0Var.f49180b) && n6.l.l(null, null) && n6.l.l(this.f49181c, r0Var.f49181c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49179a, this.f49180b, null, this.f49181c});
    }
}
