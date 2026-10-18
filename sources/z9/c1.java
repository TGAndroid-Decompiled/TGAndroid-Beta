package z9;
public final class c1 {
    public final String f51374a;
    public final String f51375b;
    public final String f51376c;
    public final String d;
    public final int e;
    public final mi.q f51377f;

    public c1(String str, String str2, String str3, String str4, int i10, mi.q qVar) {
        if (str != null) {
            this.f51374a = str;
            if (str2 != null) {
                this.f51375b = str2;
                if (str3 != null) {
                    this.f51376c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f51377f = qVar;
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
                if (this.f51374a.equals(c1Var.f51374a) && this.f51375b.equals(c1Var.f51375b) && this.f51376c.equals(c1Var.f51376c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f51377f.equals(c1Var.f51377f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51374a.hashCode() ^ 1000003) * 1000003) ^ this.f51375b.hashCode()) * 1000003) ^ this.f51376c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f51377f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51374a + ", versionCode=" + this.f51375b + ", versionName=" + this.f51376c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f51377f + "}";
    }
}
