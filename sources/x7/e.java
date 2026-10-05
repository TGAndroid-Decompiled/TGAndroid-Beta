package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f49459a;
    public transient e9.d f49460b;

    public final Map a() {
        e9.d dVar = this.f49460b;
        if (dVar == null) {
            f fVar = (f) this;
            e9.d dVar2 = new e9.d(fVar, fVar.f49474c, 1);
            this.f49460b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        a aVar = this.f49459a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f49474c);
            this.f49459a = aVar2;
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
        return ((e9.d) a()).f8731b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8731b.toString();
    }
}
