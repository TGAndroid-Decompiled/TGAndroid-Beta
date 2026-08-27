package v2;

public final class j extends q {

    public final h f48716a;

    public j(h hVar) {
        this.f48716a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f48731a;
        if (obj2.equals(obj2)) {
            return this.f48716a.equals(((j) qVar).f48716a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f48731a.hashCode() ^ 1000003) * 1000003) ^ this.f48716a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f48731a + ", androidClientInfo=" + this.f48716a + "}";
    }
}
