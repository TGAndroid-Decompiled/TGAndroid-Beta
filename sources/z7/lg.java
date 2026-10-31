package z7;

import java.util.Map;
import java.util.Set;
public abstract class lg implements k {
    public transient ed f55012a;
    public transient e9.e f55013b;

    public final Map a() {
        e9.e eVar = this.f55013b;
        if (eVar == null) {
            mg mgVar = (mg) this;
            e9.e eVar2 = new e9.e(mgVar, mgVar.f55026c, 2);
            this.f55013b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        ed edVar = this.f55012a;
        if (edVar == null) {
            mg mgVar = (mg) this;
            ed edVar2 = new ed(mgVar, mgVar.f55026c);
            this.f55012a = edVar2;
            return edVar2;
        }
        return edVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((lg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((e9.e) a()).f6349b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f6349b.toString();
    }
}
