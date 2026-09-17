package y9;
public final class c1 {
    public final String f46506a;
    public final String f46507b;
    public final String f46508c;
    public final String d;
    public final int e;
    public final n7.a1 f46509f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.a1 a1Var) {
        if (str != null) {
            this.f46506a = str;
            if (str2 != null) {
                this.f46507b = str2;
                if (str3 != null) {
                    this.f46508c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46509f = a1Var;
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
                if (this.f46506a.equals(c1Var.f46506a) && this.f46507b.equals(c1Var.f46507b) && this.f46508c.equals(c1Var.f46508c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46509f.equals(c1Var.f46509f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46506a.hashCode() ^ 1000003) * 1000003) ^ this.f46507b.hashCode()) * 1000003) ^ this.f46508c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46509f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46506a + ", versionCode=" + this.f46507b + ", versionName=" + this.f46508c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46509f + "}";
    }
}
