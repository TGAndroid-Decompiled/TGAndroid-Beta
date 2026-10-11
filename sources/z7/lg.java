package z7;

import java.util.Map;
import java.util.Set;
public abstract class lg implements k {
    public transient ed f54088a;
    public transient e9.d f54089b;

    public final Map a() {
        e9.d dVar = this.f54089b;
        if (dVar == null) {
            mg mgVar = (mg) this;
            e9.d dVar2 = new e9.d(mgVar, mgVar.f54104c, 2);
            this.f54089b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        ed edVar = this.f54088a;
        if (edVar == null) {
            mg mgVar = (mg) this;
            ed edVar2 = new ed(mgVar, mgVar.f54104c);
            this.f54088a = edVar2;
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
        return ((e9.d) a()).f8724b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8724b.toString();
    }
}
