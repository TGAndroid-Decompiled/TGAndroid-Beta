package y7;

import a8.pb;
import java.util.Map;
import java.util.Set;
public abstract class d implements p {
    public transient a f52107a;
    public transient pb f52108b;

    public final Map a() {
        pb pbVar = this.f52108b;
        if (pbVar == null) {
            e eVar = (e) this;
            pb pbVar2 = new pb(eVar, eVar.f52124c, 2);
            this.f52108b = pbVar2;
            return pbVar2;
        }
        return pbVar;
    }

    public final Set b() {
        a aVar = this.f52107a;
        if (aVar == null) {
            e eVar = (e) this;
            a aVar2 = new a(eVar, eVar.f52124c);
            this.f52107a = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return a().equals(((d) ((p) obj)).a());
    }

    public final int hashCode() {
        return ((pb) a()).f739b.hashCode();
    }

    public final String toString() {
        return ((pb) a()).f739b.toString();
    }
}
