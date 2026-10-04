package z7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f52821a;
    public transient e9.d f52822b;

    public final Map a() {
        e9.d dVar = this.f52822b;
        if (dVar == null) {
            lg lgVar = (lg) this;
            e9.d dVar2 = new e9.d(lgVar, lgVar.f52831c, 2);
            this.f52822b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        ed edVar = this.f52821a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f52831c);
            this.f52821a = edVar2;
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
        return ((e9.d) a()).f8730b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8730b.toString();
    }
}
