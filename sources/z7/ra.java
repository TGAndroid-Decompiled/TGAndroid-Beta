package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48628a;
    public final Integer f48629b;

    public ra(n7.a1 a1Var) {
        this.f48628a = (qa) a1Var.f15118b;
        this.f48629b = (Integer) a1Var.f15119c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48628a, raVar.f48628a) && n6.l.l(this.f48629b, raVar.f48629b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48628a, this.f48629b, null, null});
    }
}
