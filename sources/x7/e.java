package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f49397a;
    public transient e9.e f49398b;

    public final Map a() {
        e9.e eVar = this.f49398b;
        if (eVar == null) {
            f fVar = (f) this;
            e9.e eVar2 = new e9.e(fVar, fVar.f49411c, 1);
            this.f49398b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public final Set b() {
        a aVar = this.f49397a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f49411c);
            this.f49397a = aVar2;
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
        return ((e9.e) a()).f8436b.hashCode();
    }

    public final String toString() {
        return ((e9.e) a()).f8436b.toString();
    }
}
