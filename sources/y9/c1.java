package y9;
public final class c1 {
    public final String f51939a;
    public final String f51940b;
    public final String f51941c;
    public final String d;
    public final int f51942e;
    public final n6.t f51943f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.t tVar) {
        if (str != null) {
            this.f51939a = str;
            if (str2 != null) {
                this.f51940b = str2;
                if (str3 != null) {
                    this.f51941c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f51942e = i10;
                        this.f51943f = tVar;
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
                if (this.f51939a.equals(c1Var.f51939a) && this.f51940b.equals(c1Var.f51940b) && this.f51941c.equals(c1Var.f51941c) && this.d.equals(c1Var.d) && this.f51942e == c1Var.f51942e && this.f51943f.equals(c1Var.f51943f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51939a.hashCode() ^ 1000003) * 1000003) ^ this.f51940b.hashCode()) * 1000003) ^ this.f51941c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51942e) * 1000003) ^ this.f51943f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51939a + ", versionCode=" + this.f51940b + ", versionName=" + this.f51941c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f51942e + ", developmentPlatformProvider=" + this.f51943f + "}";
    }
}
