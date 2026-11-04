package z7;

import java.util.Arrays;
public final class r0 {
    public final m7 f60020a;
    public final Boolean f60021b;
    public final g8 f60022c;

    public r0(q0 q0Var) {
        this.f60020a = (m7) q0Var.f60011b;
        this.f60021b = (Boolean) q0Var.f60012c;
        this.f60022c = (g8) q0Var.f60010a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (p6.m.k(this.f60020a, r0Var.f60020a) && p6.m.k(this.f60021b, r0Var.f60021b) && p6.m.k(null, null) && p6.m.k(this.f60022c, r0Var.f60022c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60020a, this.f60021b, null, this.f60022c});
    }
}
