package y9;
public final class c1 {
    public final String f52127a;
    public final String f52128b;
    public final String f52129c;
    public final String d;
    public final int f52130e;
    public final n6.k f52131f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.k kVar) {
        if (str != null) {
            this.f52127a = str;
            if (str2 != null) {
                this.f52128b = str2;
                if (str3 != null) {
                    this.f52129c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f52130e = i10;
                        this.f52131f = kVar;
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
                if (this.f52127a.equals(c1Var.f52127a) && this.f52128b.equals(c1Var.f52128b) && this.f52129c.equals(c1Var.f52129c) && this.d.equals(c1Var.d) && this.f52130e == c1Var.f52130e && this.f52131f.equals(c1Var.f52131f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f52127a.hashCode() ^ 1000003) * 1000003) ^ this.f52128b.hashCode()) * 1000003) ^ this.f52129c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f52130e) * 1000003) ^ this.f52131f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f52127a + ", versionCode=" + this.f52128b + ", versionName=" + this.f52129c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f52130e + ", developmentPlatformProvider=" + this.f52131f + "}";
    }
}
