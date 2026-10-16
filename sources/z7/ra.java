package z7;

import java.util.Arrays;
public final class ra {
    public final qa f49772a;
    public final Integer f49773b;

    public ra(n3.b bVar) {
        this.f49772a = (qa) bVar.f15703b;
        this.f49773b = (Integer) bVar.f15704c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (n6.l.l(this.f49772a, raVar.f49772a) && n6.l.l(this.f49773b, raVar.f49773b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49772a, this.f49773b, null, null});
    }
}
