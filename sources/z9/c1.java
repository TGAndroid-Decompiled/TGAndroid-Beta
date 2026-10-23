package z9;
public final class c1 {
    public final String f51338a;
    public final String f51339b;
    public final String f51340c;
    public final String d;
    public final int e;
    public final mi.q f51341f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51338a = str;
            if (str2 != null) {
                this.f51339b = str2;
                if (str3 != null) {
                    this.f51340c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51341f = qVar;
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
                if (this.f51338a.equals(c1Var.f51338a) && this.f51339b.equals(c1Var.f51339b) && this.f51340c.equals(c1Var.f51340c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51341f.equals(c1Var.f51341f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51338a.hashCode() ^ 1000003) * 1000003) ^ this.f51339b.hashCode()) * 1000003) ^ this.f51340c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51341f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51338a + ", versionCode=" + this.f51339b + ", versionName=" + this.f51340c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51341f + "}";
    }
}
