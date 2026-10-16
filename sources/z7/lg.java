package z7;

import java.util.Map;
import java.util.Set;
public abstract class lg implements k {
    public transient ed f49708a;
    public transient e9.e f49709b;

    public final Map a() {
        e9.e eVar = this.f49709b;
        if (eVar == null) {
            mg mgVar = (mg) this;
            e9.e eVar2 = new e9.e(mgVar, mgVar.f49722c, 2);
            this.f49709b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        ed edVar = this.f49708a;
        if (edVar == null) {
            mg mgVar = (mg) this;
            ed edVar2 = new ed(mgVar, mgVar.f49722c);
            this.f49708a = edVar2;
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
        return ((e9.e) a()).f8554b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8554b.toString();
    }
}
