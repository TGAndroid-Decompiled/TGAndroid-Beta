package x2;
public final class n extends v {
    public final u f46694a;
    public final t f46695b;

    public n(u uVar, t tVar) {
        this.f46694a = uVar;
        this.f46695b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f46694a;
            if (uVar != null ? uVar.equals(((n) vVar).f46694a) : ((n) vVar).f46694a == null) {
                t tVar = this.f46695b;
                if (tVar != null ? tVar.equals(((n) vVar).f46695b) : ((n) vVar).f46695b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        u uVar = this.f46694a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f46695b;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f46694a + ", mobileSubtype=" + this.f46695b + "}";
    }
}
