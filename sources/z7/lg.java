package z7;

import java.util.Map;
import java.util.Set;
public abstract class lg implements k {
    public transient fd f51091a;
    public transient e9.e f51092b;

    public final Map a() {
        e9.e eVar = this.f51092b;
        if (eVar == null) {
            mg mgVar = (mg) this;
            e9.e eVar2 = new e9.e(mgVar, mgVar.f51105c, 2);
            this.f51092b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        fd fdVar = this.f51091a;
        if (fdVar == null) {
            mg mgVar = (mg) this;
            fd fdVar2 = new fd(mgVar, mgVar.f51105c);
            this.f51091a = fdVar2;
            return fdVar2;
        }
        return fdVar;
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
        return ((e9.e) a()).f8434b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8434b.toString();
    }
}
