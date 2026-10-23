package z9;
public final class c1 {
    public final String f51799a;
    public final String f51800b;
    public final String f51801c;
    public final String d;
    public final int e;
    public final mi.q f51802f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51799a = str;
            if (str2 != null) {
                this.f51800b = str2;
                if (str3 != null) {
                    this.f51801c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51802f = qVar;
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
                if (this.f51799a.equals(c1Var.f51799a) && this.f51800b.equals(c1Var.f51800b) && this.f51801c.equals(c1Var.f51801c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51802f.equals(c1Var.f51802f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51799a.hashCode() ^ 1000003) * 1000003) ^ this.f51800b.hashCode()) * 1000003) ^ this.f51801c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51802f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51799a + ", versionCode=" + this.f51800b + ", versionName=" + this.f51801c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51802f + "}";
    }
}
