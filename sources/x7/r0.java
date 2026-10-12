package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f51152a;
    public final Boolean f51153b;
    public final h8 f51154c;

    public r0(v7.k kVar) {
        this.f51152a = (n7) kVar.f49474b;
        this.f51153b = (Boolean) kVar.f49475c;
        this.f51154c = (h8) kVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.m.l(this.f51152a, r0Var.f51152a) && n6.m.l(this.f51153b, r0Var.f51153b) && n6.m.l(null, null) && n6.m.l(this.f51154c, r0Var.f51154c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51152a, this.f51153b, null, this.f51154c});
    }
}
