package z9;
public final class c1 {
    public final String f55264a;
    public final String f55265b;
    public final String f55266c;
    public final String d;
    public final int e;
    public final u9.b f55267f;

    public c1(String str, String str2, String str3, String str4, int i10, u9.b bVar) {
        if (str != null) {
            this.f55264a = str;
            if (str2 != null) {
                this.f55265b = str2;
                if (str3 != null) {
                    this.f55266c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f55267f = bVar;
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
                if (this.f55264a.equals(c1Var.f55264a) && this.f55265b.equals(c1Var.f55265b) && this.f55266c.equals(c1Var.f55266c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f55267f.equals(c1Var.f55267f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f55264a.hashCode() ^ 1000003) * 1000003) ^ this.f55265b.hashCode()) * 1000003) ^ this.f55266c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f55267f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f55264a + ", versionCode=" + this.f55265b + ", versionName=" + this.f55266c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f55267f + "}";
    }
}
