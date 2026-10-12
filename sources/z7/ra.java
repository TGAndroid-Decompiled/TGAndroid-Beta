package z7;

import java.util.Arrays;
public final class ra {
    public final qa f49770a;
    public final Integer f49771b;

    public ra(n6.o oVar) {
        this.f49770a = (qa) oVar.f16131b;
        this.f49771b = (Integer) oVar.f16132c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f49770a, raVar.f49770a) && n6.l.l(this.f49771b, raVar.f49771b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49770a, this.f49771b, null, null});
    }
}
