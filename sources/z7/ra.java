package z7;

import java.util.Arrays;
public final class ra {
    public final qa f48623a;
    public final Integer f48624b;

    public ra(n7.a1 a1Var) {
        this.f48623a = (qa) a1Var.f15118b;
        this.f48624b = (Integer) a1Var.f15119c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f48623a, raVar.f48623a) && n6.l.l(this.f48624b, raVar.f48624b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48623a, this.f48624b, null, null});
    }
}
