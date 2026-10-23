package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f49360a;
    public transient e9.e f49361b;

    public final Map a() {
        e9.e eVar = this.f49361b;
        if (eVar == null) {
            f fVar = (f) this;
            e9.e eVar2 = new e9.e(fVar, fVar.f49374c, 1);
            this.f49361b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        a aVar = this.f49360a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f49374c);
            this.f49360a = aVar2;
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
        return ((e9.e) a()).f8433b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8433b.toString();
    }
}
