package x2;
public final class j extends q {
    public final h f46752a;

    public j(h hVar) {
        this.f46752a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f46765a;
                if (obj2.equals(obj2)) {
                    if (this.f46752a.equals(((j) qVar).f46752a)) {
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
        return ((p.f46765a.hashCode() ^ 1000003) * 1000003) ^ this.f46752a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f46765a + ", androidClientInfo=" + this.f46752a + "}";
    }
}
