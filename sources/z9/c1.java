package z9;
public final class c1 {
    public final String f55246a;
    public final String f55247b;
    public final String f55248c;
    public final String d;
    public final int e;
    public final u9.b f55249f;

    public c1(String str, String str2, String str3, String str4, int i10, u9.b bVar) {
        if (str != null) {
            this.f55246a = str;
            if (str2 != null) {
                this.f55247b = str2;
                if (str3 != null) {
                    this.f55248c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f55249f = bVar;
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
                if (this.f55246a.equals(c1Var.f55246a) && this.f55247b.equals(c1Var.f55247b) && this.f55248c.equals(c1Var.f55248c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f55249f.equals(c1Var.f55249f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f55246a.hashCode() ^ 1000003) * 1000003) ^ this.f55247b.hashCode()) * 1000003) ^ this.f55248c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f55249f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f55246a + ", versionCode=" + this.f55247b + ", versionName=" + this.f55248c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f55249f + "}";
    }
}
