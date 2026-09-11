package y9;
public final class c1 {
    public final String f49717a;
    public final String f49718b;
    public final String f49719c;
    public final String d;
    public final int f49720e;
    public final n7.z0 f49721f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f49717a = str;
            if (str2 != null) {
                this.f49718b = str2;
                if (str3 != null) {
                    this.f49719c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f49720e = i10;
                        this.f49721f = z0Var;
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
                if (this.f49717a.equals(c1Var.f49717a) && this.f49718b.equals(c1Var.f49718b) && this.f49719c.equals(c1Var.f49719c) && this.d.equals(c1Var.d) && this.f49720e == c1Var.f49720e && this.f49721f.equals(c1Var.f49721f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f49717a.hashCode() ^ 1000003) * 1000003) ^ this.f49718b.hashCode()) * 1000003) ^ this.f49719c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49720e) * 1000003) ^ this.f49721f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f49717a + ", versionCode=" + this.f49718b + ", versionName=" + this.f49719c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f49720e + ", developmentPlatformProvider=" + this.f49721f + "}";
    }
}
