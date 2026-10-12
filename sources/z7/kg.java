package z7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f49698a;
    public transient e9.e f49699b;

    public final Map a() {
        e9.e eVar = this.f49699b;
        if (eVar == null) {
            lg lgVar = (lg) this;
            e9.e eVar2 = new e9.e(lgVar, lgVar.f49708c, 2);
            this.f49699b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        ed edVar = this.f49698a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f49708c);
            this.f49698a = edVar2;
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
        return a().equals(((kg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((e9.e) a()).f8551b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8551b.toString();
    }
}
