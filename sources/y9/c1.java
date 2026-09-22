package y9;
public final class c1 {
    public final String f46479a;
    public final String f46480b;
    public final String f46481c;
    public final String d;
    public final int e;
    public final n7.a1 f46482f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.a1 a1Var) {
        if (str != null) {
            this.f46479a = str;
            if (str2 != null) {
                this.f46480b = str2;
                if (str3 != null) {
                    this.f46481c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46482f = a1Var;
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
                if (this.f46479a.equals(c1Var.f46479a) && this.f46480b.equals(c1Var.f46480b) && this.f46481c.equals(c1Var.f46481c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46482f.equals(c1Var.f46482f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46479a.hashCode() ^ 1000003) * 1000003) ^ this.f46480b.hashCode()) * 1000003) ^ this.f46481c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46482f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46479a + ", versionCode=" + this.f46480b + ", versionName=" + this.f46481c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46482f + "}";
    }
}
