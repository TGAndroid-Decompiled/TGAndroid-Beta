package x7;

import java.util.Map;
import java.util.Set;
public abstract class e implements q {
    public transient a f45422a;
    public transient e9.d f45423b;

    public final Map a() {
        e9.d dVar = this.f45423b;
        if (dVar == null) {
            f fVar = (f) this;
            e9.d dVar2 = new e9.d(fVar, fVar.f45436c, 1);
            this.f45423b = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final Set b() {
        a aVar = this.f45422a;
        if (aVar == null) {
            f fVar = (f) this;
            a aVar2 = new a(fVar, fVar.f45436c);
            this.f45422a = aVar2;
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
        return ((e9.d) a()).f8064b.hashCode();
    }

    public final String toString() {
        return ((e9.d) a()).f8064b.toString();
    }
}
