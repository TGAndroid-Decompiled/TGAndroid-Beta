package y9;
public final class c1 {
    public final String f52016a;
    public final String f52017b;
    public final String f52018c;
    public final String d;
    public final int f52019e;
    public final n6.k f52020f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.k kVar) {
        if (str != null) {
            this.f52016a = str;
            if (str2 != null) {
                this.f52017b = str2;
                if (str3 != null) {
                    this.f52018c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f52019e = i10;
                        this.f52020f = kVar;
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
                if (this.f52016a.equals(c1Var.f52016a) && this.f52017b.equals(c1Var.f52017b) && this.f52018c.equals(c1Var.f52018c) && this.d.equals(c1Var.d) && this.f52019e == c1Var.f52019e && this.f52020f.equals(c1Var.f52020f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f52016a.hashCode() ^ 1000003) * 1000003) ^ this.f52017b.hashCode()) * 1000003) ^ this.f52018c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f52019e) * 1000003) ^ this.f52020f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f52016a + ", versionCode=" + this.f52017b + ", versionName=" + this.f52018c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f52019e + ", developmentPlatformProvider=" + this.f52020f + "}";
    }
}
