package v2;
public final class j extends q {
    public final h f48289a;

    public j(h hVar) {
        this.f48289a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f48304a;
                if (obj2.equals(obj2)) {
                    if (this.f48289a.equals(((j) qVar).f48289a)) {
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
        return ((p.f48304a.hashCode() ^ 1000003) * 1000003) ^ this.f48289a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f48304a + ", androidClientInfo=" + this.f48289a + "}";
    }
}
