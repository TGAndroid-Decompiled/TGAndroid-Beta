package z7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f47644a;
    public transient e9.d f47645b;

    public final Map a() {
        e9.d dVar = this.f47645b;
        if (dVar == null) {
            lg lgVar = (lg) this;
            e9.d dVar2 = new e9.d(lgVar, lgVar.f47654c, 2);
            this.f47645b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        ed edVar = this.f47644a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f47654c);
            this.f47644a = edVar2;
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
        return ((e9.d) a()).f7364b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f7364b.toString();
    }
}
