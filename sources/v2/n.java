package v2;
public final class n extends v {
    public final u f48302a;
    public final t f48303b;

    public n(u uVar, t tVar) {
        this.f48302a = uVar;
        this.f48303b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f48302a;
            if (uVar != null ? uVar.equals(((n) vVar).f48302a) : ((n) vVar).f48302a == null) {
                t tVar = this.f48303b;
                if (tVar != null ? tVar.equals(((n) vVar).f48303b) : ((n) vVar).f48303b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        u uVar = this.f48302a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f48303b;
        if (tVar != null) {
            i9 = tVar.hashCode();
        }
        return i9 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f48302a + ", mobileSubtype=" + this.f48303b + "}";
    }
}
