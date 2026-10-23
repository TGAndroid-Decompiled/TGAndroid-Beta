package z7;

import java.util.Arrays;
public final class ra {
    public final qa f51627a;
    public final Integer f51628b;

    public ra(n2.e eVar) {
        this.f51627a = (qa) eVar.f17102b;
        this.f51628b = (Integer) eVar.f17103c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f51627a, raVar.f51627a) && n6.l.l(this.f51628b, raVar.f51628b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51627a, this.f51628b, null, null});
    }
}
