package y9;
public final class c1 {
    public final String f49718a;
    public final String f49719b;
    public final String f49720c;
    public final String d;
    public final int f49721e;
    public final n7.z0 f49722f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f49718a = str;
            if (str2 != null) {
                this.f49719b = str2;
                if (str3 != null) {
                    this.f49720c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f49721e = i10;
                        this.f49722f = z0Var;
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
                if (this.f49718a.equals(c1Var.f49718a) && this.f49719b.equals(c1Var.f49719b) && this.f49720c.equals(c1Var.f49720c) && this.d.equals(c1Var.d) && this.f49721e == c1Var.f49721e && this.f49722f.equals(c1Var.f49722f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f49718a.hashCode() ^ 1000003) * 1000003) ^ this.f49719b.hashCode()) * 1000003) ^ this.f49720c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49721e) * 1000003) ^ this.f49722f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f49718a + ", versionCode=" + this.f49719b + ", versionName=" + this.f49720c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f49721e + ", developmentPlatformProvider=" + this.f49722f + "}";
    }
}
