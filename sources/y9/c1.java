package y9;
public final class c1 {
    public final String f51982a;
    public final String f51983b;
    public final String f51984c;
    public final String d;
    public final int f51985e;
    public final n6.k f51986f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.k kVar) {
        if (str != null) {
            this.f51982a = str;
            if (str2 != null) {
                this.f51983b = str2;
                if (str3 != null) {
                    this.f51984c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f51985e = i10;
                        this.f51986f = kVar;
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
                if (this.f51982a.equals(c1Var.f51982a) && this.f51983b.equals(c1Var.f51983b) && this.f51984c.equals(c1Var.f51984c) && this.d.equals(c1Var.d) && this.f51985e == c1Var.f51985e && this.f51986f.equals(c1Var.f51986f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51982a.hashCode() ^ 1000003) * 1000003) ^ this.f51983b.hashCode()) * 1000003) ^ this.f51984c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51985e) * 1000003) ^ this.f51986f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51982a + ", versionCode=" + this.f51983b + ", versionName=" + this.f51984c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f51985e + ", developmentPlatformProvider=" + this.f51986f + "}";
    }
}
