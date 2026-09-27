package z7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f48843a;
    public transient e9.d f48844b;

    public final Map a() {
        e9.d dVar = this.f48844b;
        if (dVar == null) {
            lg lgVar = (lg) this;
            e9.d dVar2 = new e9.d(lgVar, lgVar.f48853c, 2);
            this.f48844b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        ed edVar = this.f48843a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f48853c);
            this.f48843a = edVar2;
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
        return ((e9.d) a()).f8048b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8048b.toString();
    }
}
