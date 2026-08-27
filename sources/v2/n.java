package v2;

public final class n extends v {

    public final u f48729a;

    public final t f48730b;

    public n(u uVar, t tVar) {
        this.f48729a = uVar;
        this.f48730b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f48729a;
            if (uVar != null ? uVar.equals(((n) vVar).f48729a) : ((n) vVar).f48729a == null) {
                t tVar = this.f48730b;
                if (tVar != null ? tVar.equals(((n) vVar).f48730b) : ((n) vVar).f48730b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f48729a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f48730b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f48729a + ", mobileSubtype=" + this.f48730b + "}";
    }
}
