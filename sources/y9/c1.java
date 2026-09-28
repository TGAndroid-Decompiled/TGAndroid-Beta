package y9;
public final class c1 {
    public final String f46763a;
    public final String f46764b;
    public final String f46765c;
    public final String d;
    public final int e;
    public final n7.z0 f46766f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46763a = str;
            if (str2 != null) {
                this.f46764b = str2;
                if (str3 != null) {
                    this.f46765c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46766f = z0Var;
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
                if (this.f46763a.equals(c1Var.f46763a) && this.f46764b.equals(c1Var.f46764b) && this.f46765c.equals(c1Var.f46765c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46766f.equals(c1Var.f46766f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46763a.hashCode() ^ 1000003) * 1000003) ^ this.f46764b.hashCode()) * 1000003) ^ this.f46765c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46766f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46763a + ", versionCode=" + this.f46764b + ", versionName=" + this.f46765c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46766f + "}";
    }
}
