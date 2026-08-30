package x2;
public final class j extends q {
    public final h f46683a;

    public j(h hVar) {
        this.f46683a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f46696a;
                if (obj2.equals(obj2)) {
                    if (this.f46683a.equals(((j) qVar).f46683a)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((p.f46696a.hashCode() ^ 1000003) * 1000003) ^ this.f46683a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f46696a + ", androidClientInfo=" + this.f46683a + "}";
    }
}
