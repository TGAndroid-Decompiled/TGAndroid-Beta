package z9;
public final class c1 {
    public final String f51329a;
    public final String f51330b;
    public final String f51331c;
    public final String d;
    public final int e;
    public final mi.q f51332f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51329a = str;
            if (str2 != null) {
                this.f51330b = str2;
                if (str3 != null) {
                    this.f51331c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51332f = qVar;
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
                if (this.f51329a.equals(c1Var.f51329a) && this.f51330b.equals(c1Var.f51330b) && this.f51331c.equals(c1Var.f51331c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51332f.equals(c1Var.f51332f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51329a.hashCode() ^ 1000003) * 1000003) ^ this.f51330b.hashCode()) * 1000003) ^ this.f51331c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51332f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51329a + ", versionCode=" + this.f51330b + ", versionName=" + this.f51331c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51332f + "}";
    }
}
