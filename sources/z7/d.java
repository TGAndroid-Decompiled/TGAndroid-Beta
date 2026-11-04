package z7;

import b8.mb;
import java.util.Map;
import java.util.Set;
public abstract class d implements p {
    public transient a f59824a;
    public transient mb f59825b;

    public final Map a() {
        mb mbVar = this.f59825b;
        if (mbVar == null) {
            e eVar = (e) this;
            mb mbVar2 = new mb(eVar, eVar.f59849c, 2);
            this.f59825b = mbVar2;
            return mbVar2;
        }
        return mbVar;
    }

    public final Set b() {
        a aVar = this.f59824a;
        if (aVar == null) {
            e eVar = (e) this;
            a aVar2 = new a(eVar, eVar.f59849c);
            this.f59824a = aVar2;
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
        return ((mb) a()).f2754b.hashCode();
    }

    public final String toString() {
        return ((mb) a()).f2754b.toString();
    }
}
