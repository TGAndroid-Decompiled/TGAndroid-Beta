package z7;

import java.util.Arrays;
public final class ra {
    public final qa f54125a;
    public final Integer f54126b;

    public ra(n7.z0 z0Var) {
        this.f54125a = (qa) z0Var.f16869b;
        this.f54126b = (Integer) z0Var.f16870c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.m.l(this.f54125a, raVar.f54125a) && n6.m.l(this.f54126b, raVar.f54126b) && n6.m.l(null, null) && n6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54125a, this.f54126b, null, null});
    }
}
