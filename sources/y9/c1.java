package y9;
public final class c1 {
    public final String f50599a;
    public final String f50600b;
    public final String f50601c;
    public final String d;
    public final int f50602e;
    public final n7.z0 f50603f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f50599a = str;
            if (str2 != null) {
                this.f50600b = str2;
                if (str3 != null) {
                    this.f50601c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f50602e = i10;
                        this.f50603f = z0Var;
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
                if (this.f50599a.equals(c1Var.f50599a) && this.f50600b.equals(c1Var.f50600b) && this.f50601c.equals(c1Var.f50601c) && this.d.equals(c1Var.d) && this.f50602e == c1Var.f50602e && this.f50603f.equals(c1Var.f50603f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f50599a.hashCode() ^ 1000003) * 1000003) ^ this.f50600b.hashCode()) * 1000003) ^ this.f50601c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f50602e) * 1000003) ^ this.f50603f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f50599a + ", versionCode=" + this.f50600b + ", versionName=" + this.f50601c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f50602e + ", developmentPlatformProvider=" + this.f50603f + "}";
    }
}
