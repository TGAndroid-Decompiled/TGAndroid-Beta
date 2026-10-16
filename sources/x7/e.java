package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f47963a;
    public transient e9.e f47964b;

    public final Map a() {
        e9.e eVar = this.f47964b;
        if (eVar == null) {
            f fVar = (f) this;
            e9.e eVar2 = new e9.e(fVar, fVar.f47977c, 1);
            this.f47964b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        a aVar = this.f47963a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f47977c);
            this.f47963a = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return a().equals(((e) ((q) obj)).a());
    }

    public final int hashCode() {
        return ((e9.e) a()).f8554b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8554b.toString();
    }
}
