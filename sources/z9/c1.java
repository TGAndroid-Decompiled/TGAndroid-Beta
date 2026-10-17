package z9;
public final class c1 {
    public final String f51349a;
    public final String f51350b;
    public final String f51351c;
    public final String d;
    public final int e;
    public final mi.q f51352f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51349a = str;
            if (str2 != null) {
                this.f51350b = str2;
                if (str3 != null) {
                    this.f51351c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51352f = qVar;
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
                if (this.f51349a.equals(c1Var.f51349a) && this.f51350b.equals(c1Var.f51350b) && this.f51351c.equals(c1Var.f51351c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51352f.equals(c1Var.f51352f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51349a.hashCode() ^ 1000003) * 1000003) ^ this.f51350b.hashCode()) * 1000003) ^ this.f51351c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51352f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51349a + ", versionCode=" + this.f51350b + ", versionName=" + this.f51351c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51352f + "}";
    }
}
