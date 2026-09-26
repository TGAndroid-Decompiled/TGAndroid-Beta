package y9;
public final class c1 {
    public final String f46761a;
    public final String f46762b;
    public final String f46763c;
    public final String d;
    public final int e;
    public final n7.z0 f46764f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46761a = str;
            if (str2 != null) {
                this.f46762b = str2;
                if (str3 != null) {
                    this.f46763c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46764f = z0Var;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                if (this.f46761a.equals(c1Var.f46761a) && this.f46762b.equals(c1Var.f46762b) && this.f46763c.equals(c1Var.f46763c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46764f.equals(c1Var.f46764f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46761a.hashCode() ^ 1000003) * 1000003) ^ this.f46762b.hashCode()) * 1000003) ^ this.f46763c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46764f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46761a + ", versionCode=" + this.f46762b + ", versionName=" + this.f46763c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46764f + "}";
    }
}
