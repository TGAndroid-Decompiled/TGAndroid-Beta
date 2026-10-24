package z7;

import java.util.Arrays;
public final class ra {
    public final qa f51626a;
    public final Integer f51627b;

    public ra(n2.e eVar) {
        this.f51626a = (qa) eVar.f17102b;
        this.f51627b = (Integer) eVar.f17103c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f51626a, raVar.f51626a) && n6.l.l(this.f51627b, raVar.f51627b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51626a, this.f51627b, null, null});
    }
}
