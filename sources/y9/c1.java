package y9;
public final class c1 {
    public final String f46738a;
    public final String f46739b;
    public final String f46740c;
    public final String d;
    public final int e;
    public final n7.z0 f46741f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46738a = str;
            if (str2 != null) {
                this.f46739b = str2;
                if (str3 != null) {
                    this.f46740c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46741f = z0Var;
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
                if (this.f46738a.equals(c1Var.f46738a) && this.f46739b.equals(c1Var.f46739b) && this.f46740c.equals(c1Var.f46740c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46741f.equals(c1Var.f46741f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46738a.hashCode() ^ 1000003) * 1000003) ^ this.f46739b.hashCode()) * 1000003) ^ this.f46740c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46741f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46738a + ", versionCode=" + this.f46739b + ", versionName=" + this.f46740c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46741f + "}";
    }
}
