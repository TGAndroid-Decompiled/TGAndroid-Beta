package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f48963a;
    public transient e9.d f48964b;

    public final Map a() {
        e9.d dVar = this.f48964b;
        if (dVar == null) {
            f fVar = (f) this;
            e9.d dVar2 = new e9.d(fVar, fVar.f48978c, 1);
            this.f48964b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        a aVar = this.f48963a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f48978c);
            this.f48963a = aVar2;
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
        return ((e9.d) a()).f8930b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8930b.toString();
    }
}
