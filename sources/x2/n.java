package x2;
public final class n extends v {
    public final u f50290a;
    public final t f50291b;

    public n(u uVar, t tVar) {
        this.f50290a = uVar;
        this.f50291b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f50290a;
            if (uVar != null ? uVar.equals(((n) vVar).f50290a) : ((n) vVar).f50290a == null) {
                t tVar = this.f50291b;
                if (tVar != null ? tVar.equals(((n) vVar).f50291b) : ((n) vVar).f50291b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f50290a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f50291b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f50290a + ", mobileSubtype=" + this.f50291b + "}";
    }
}
