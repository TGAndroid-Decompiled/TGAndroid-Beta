package z9;
public final class c1 {
    public final String f51334a;
    public final String f51335b;
    public final String f51336c;
    public final String d;
    public final int e;
    public final mi.q f51337f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51334a = str;
            if (str2 != null) {
                this.f51335b = str2;
                if (str3 != null) {
                    this.f51336c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51337f = qVar;
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
                if (this.f51334a.equals(c1Var.f51334a) && this.f51335b.equals(c1Var.f51335b) && this.f51336c.equals(c1Var.f51336c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51337f.equals(c1Var.f51337f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51334a.hashCode() ^ 1000003) * 1000003) ^ this.f51335b.hashCode()) * 1000003) ^ this.f51336c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51337f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51334a + ", versionCode=" + this.f51335b + ", versionName=" + this.f51336c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51337f + "}";
    }
}
