package y9;
public final class c1 {
    public final String f46762a;
    public final String f46763b;
    public final String f46764c;
    public final String d;
    public final int e;
    public final n7.z0 f46765f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46762a = str;
            if (str2 != null) {
                this.f46763b = str2;
                if (str3 != null) {
                    this.f46764c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46765f = z0Var;
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
                if (this.f46762a.equals(c1Var.f46762a) && this.f46763b.equals(c1Var.f46763b) && this.f46764c.equals(c1Var.f46764c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46765f.equals(c1Var.f46765f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46762a.hashCode() ^ 1000003) * 1000003) ^ this.f46763b.hashCode()) * 1000003) ^ this.f46764c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46765f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46762a + ", versionCode=" + this.f46763b + ", versionName=" + this.f46764c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46765f + "}";
    }
}
