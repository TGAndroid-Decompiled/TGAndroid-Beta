package x2;
public final class j extends q {
    public final h f50027a;

    public j(h hVar) {
        this.f50027a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f50042a;
                if (obj2.equals(obj2)) {
                    if (this.f50027a.equals(((j) qVar).f50027a)) {
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
        return ((p.f50042a.hashCode() ^ 1000003) * 1000003) ^ this.f50027a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f50042a + ", androidClientInfo=" + this.f50027a + "}";
    }
}
