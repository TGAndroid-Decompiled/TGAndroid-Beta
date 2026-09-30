package y9;
public final class c1 {
    public final String f46870a;
    public final String f46871b;
    public final String f46872c;
    public final String d;
    public final int e;
    public final n7.z0 f46873f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46870a = str;
            if (str2 != null) {
                this.f46871b = str2;
                if (str3 != null) {
                    this.f46872c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46873f = z0Var;
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
                if (this.f46870a.equals(c1Var.f46870a) && this.f46871b.equals(c1Var.f46871b) && this.f46872c.equals(c1Var.f46872c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46873f.equals(c1Var.f46873f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46870a.hashCode() ^ 1000003) * 1000003) ^ this.f46871b.hashCode()) * 1000003) ^ this.f46872c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46873f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46870a + ", versionCode=" + this.f46871b + ", versionName=" + this.f46872c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46873f + "}";
    }
}
