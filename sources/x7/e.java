package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f50733a;
    public transient e9.d f50734b;

    public final Map a() {
        e9.d dVar = this.f50734b;
        if (dVar == null) {
            f fVar = (f) this;
            e9.d dVar2 = new e9.d(fVar, fVar.f50748c, 1);
            this.f50734b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        a aVar = this.f50733a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f50748c);
            this.f50733a = aVar2;
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
        return ((e9.d) a()).f8725b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8725b.toString();
    }
}
