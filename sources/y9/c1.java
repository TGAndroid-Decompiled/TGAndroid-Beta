package y9;
public final class c1 {
    public final String f50607a;
    public final String f50608b;
    public final String f50609c;
    public final String d;
    public final int f50610e;
    public final n7.z0 f50611f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f50607a = str;
            if (str2 != null) {
                this.f50608b = str2;
                if (str3 != null) {
                    this.f50609c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f50610e = i10;
                        this.f50611f = z0Var;
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
                if (this.f50607a.equals(c1Var.f50607a) && this.f50608b.equals(c1Var.f50608b) && this.f50609c.equals(c1Var.f50609c) && this.d.equals(c1Var.d) && this.f50610e == c1Var.f50610e && this.f50611f.equals(c1Var.f50611f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f50607a.hashCode() ^ 1000003) * 1000003) ^ this.f50608b.hashCode()) * 1000003) ^ this.f50609c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f50610e) * 1000003) ^ this.f50611f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f50607a + ", versionCode=" + this.f50608b + ", versionName=" + this.f50609c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f50610e + ", developmentPlatformProvider=" + this.f50611f + "}";
    }
}
