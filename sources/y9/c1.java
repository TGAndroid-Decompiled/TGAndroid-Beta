package y9;
public final class c1 {
    public final String f52119a;
    public final String f52120b;
    public final String f52121c;
    public final String d;
    public final int f52122e;
    public final n6.k f52123f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.k kVar) {
        if (str != null) {
            this.f52119a = str;
            if (str2 != null) {
                this.f52120b = str2;
                if (str3 != null) {
                    this.f52121c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f52122e = i10;
                        this.f52123f = kVar;
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
                if (this.f52119a.equals(c1Var.f52119a) && this.f52120b.equals(c1Var.f52120b) && this.f52121c.equals(c1Var.f52121c) && this.d.equals(c1Var.d) && this.f52122e == c1Var.f52122e && this.f52123f.equals(c1Var.f52123f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f52119a.hashCode() ^ 1000003) * 1000003) ^ this.f52120b.hashCode()) * 1000003) ^ this.f52121c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f52122e) * 1000003) ^ this.f52123f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f52119a + ", versionCode=" + this.f52120b + ", versionName=" + this.f52121c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f52122e + ", developmentPlatformProvider=" + this.f52123f + "}";
    }
}
