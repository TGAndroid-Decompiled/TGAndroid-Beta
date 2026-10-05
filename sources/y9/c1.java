package y9;
public final class c1 {
    public final String f50614a;
    public final String f50615b;
    public final String f50616c;
    public final String d;
    public final int f50617e;
    public final n7.z0 f50618f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f50614a = str;
            if (str2 != null) {
                this.f50615b = str2;
                if (str3 != null) {
                    this.f50616c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f50617e = i10;
                        this.f50618f = z0Var;
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
                if (this.f50614a.equals(c1Var.f50614a) && this.f50615b.equals(c1Var.f50615b) && this.f50616c.equals(c1Var.f50616c) && this.d.equals(c1Var.d) && this.f50617e == c1Var.f50617e && this.f50618f.equals(c1Var.f50618f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f50614a.hashCode() ^ 1000003) * 1000003) ^ this.f50615b.hashCode()) * 1000003) ^ this.f50616c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f50617e) * 1000003) ^ this.f50618f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f50614a + ", versionCode=" + this.f50615b + ", versionName=" + this.f50616c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f50617e + ", developmentPlatformProvider=" + this.f50618f + "}";
    }
}
