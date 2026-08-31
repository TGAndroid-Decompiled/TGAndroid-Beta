package x2;
public final class j extends q {
    public final h f50277a;

    public j(h hVar) {
        this.f50277a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f50292a;
                if (obj2.equals(obj2)) {
                    if (this.f50277a.equals(((j) qVar).f50277a)) {
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
        return ((p.f50292a.hashCode() ^ 1000003) * 1000003) ^ this.f50277a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f50292a + ", androidClientInfo=" + this.f50277a + "}";
    }
}
