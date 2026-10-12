package z9;
public final class c1 {
    public final String f49943a;
    public final String f49944b;
    public final String f49945c;
    public final String d;
    public final int e;
    public final m4.c f49946f;

    public c1(String str, String str2, String str3, String str4, int i10, m4.c cVar) {
        if (str != null) {
            this.f49943a = str;
            if (str2 != null) {
                this.f49944b = str2;
                if (str3 != null) {
                    this.f49945c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f49946f = cVar;
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
                if (this.f49943a.equals(c1Var.f49943a) && this.f49944b.equals(c1Var.f49944b) && this.f49945c.equals(c1Var.f49945c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f49946f.equals(c1Var.f49946f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f49943a.hashCode() ^ 1000003) * 1000003) ^ this.f49944b.hashCode()) * 1000003) ^ this.f49945c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f49946f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f49943a + ", versionCode=" + this.f49944b + ", versionName=" + this.f49945c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f49946f + "}";
    }
}
