package z9;
public final class c1 {
    public final String f49944a;
    public final String f49945b;
    public final String f49946c;
    public final String d;
    public final int e;
    public final m2.t f49947f;

    public c1(String str, String str2, String str3, String str4, int i10, m2.t tVar) {
        if (str != null) {
            this.f49944a = str;
            if (str2 != null) {
                this.f49945b = str2;
                if (str3 != null) {
                    this.f49946c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f49947f = tVar;
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
                if (this.f49944a.equals(c1Var.f49944a) && this.f49945b.equals(c1Var.f49945b) && this.f49946c.equals(c1Var.f49946c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f49947f.equals(c1Var.f49947f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f49944a.hashCode() ^ 1000003) * 1000003) ^ this.f49945b.hashCode()) * 1000003) ^ this.f49946c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f49947f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f49944a + ", versionCode=" + this.f49945b + ", versionName=" + this.f49946c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f49947f + "}";
    }
}
