package z7;

import java.util.Arrays;
public final class ta {
    public final sa f51198a;
    public final Integer f51199b;

    public ta(ra raVar) {
        this.f51198a = (sa) raVar.f51173a;
        this.f51199b = (Integer) raVar.f51174b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        if (n6.l.l(this.f51198a, taVar.f51198a) && n6.l.l(this.f51199b, taVar.f51199b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51198a, this.f51199b, null, null});
    }
}
