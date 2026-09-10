package y9;
public final class c1 {
    public final String f46633a;
    public final String f46634b;
    public final String f46635c;
    public final String d;
    public final int e;
    public final og.u0 f46636f;

    public c1(String str, String str2, String str3, String str4, int i10, og.u0 u0Var) {
        if (str != null) {
            this.f46633a = str;
            if (str2 != null) {
                this.f46634b = str2;
                if (str3 != null) {
                    this.f46635c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46636f = u0Var;
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
                if (this.f46633a.equals(c1Var.f46633a) && this.f46634b.equals(c1Var.f46634b) && this.f46635c.equals(c1Var.f46635c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46636f.equals(c1Var.f46636f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46633a.hashCode() ^ 1000003) * 1000003) ^ this.f46634b.hashCode()) * 1000003) ^ this.f46635c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46636f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46633a + ", versionCode=" + this.f46634b + ", versionName=" + this.f46635c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46636f + "}";
    }
}
