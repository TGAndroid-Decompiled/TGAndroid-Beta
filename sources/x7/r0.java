package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f49178a;
    public final Boolean f49179b;
    public final h8 f49180c;

    public r0(v7.a6 a6Var) {
        this.f49178a = (n7) a6Var.f47406b;
        this.f49179b = (Boolean) a6Var.d;
        this.f49180c = (h8) a6Var.f47407c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f49178a, r0Var.f49178a) && n6.l.l(this.f49179b, r0Var.f49179b) && n6.l.l(null, null) && n6.l.l(this.f49180c, r0Var.f49180c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49178a, this.f49179b, null, this.f49180c});
    }
}
