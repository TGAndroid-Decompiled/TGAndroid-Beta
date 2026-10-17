package z7;

import java.util.Map;
import java.util.Set;
public abstract class mg implements k {
    public transient gd f51122a;
    public transient e9.e f51123b;

    public final Map a() {
        e9.e eVar = this.f51123b;
        if (eVar == null) {
            ng ngVar = (ng) this;
            e9.e eVar2 = new e9.e(ngVar, ngVar.f51136c, 2);
            this.f51123b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        gd gdVar = this.f51122a;
        if (gdVar == null) {
            ng ngVar = (ng) this;
            gd gdVar2 = new gd(ngVar, ngVar.f51136c);
            this.f51122a = gdVar2;
            return gdVar2;
        }
        return gdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((mg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((e9.e) a()).f8435b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8435b.toString();
    }
}
