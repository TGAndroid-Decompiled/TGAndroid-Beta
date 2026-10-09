package y9;
public final class c1 {
    public final String f51895a;
    public final String f51896b;
    public final String f51897c;
    public final String d;
    public final int f51898e;
    public final n6.t f51899f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.t tVar) {
        if (str != null) {
            this.f51895a = str;
            if (str2 != null) {
                this.f51896b = str2;
                if (str3 != null) {
                    this.f51897c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f51898e = i10;
                        this.f51899f = tVar;
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
                if (this.f51895a.equals(c1Var.f51895a) && this.f51896b.equals(c1Var.f51896b) && this.f51897c.equals(c1Var.f51897c) && this.d.equals(c1Var.d) && this.f51898e == c1Var.f51898e && this.f51899f.equals(c1Var.f51899f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51895a.hashCode() ^ 1000003) * 1000003) ^ this.f51896b.hashCode()) * 1000003) ^ this.f51897c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51898e) * 1000003) ^ this.f51899f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51895a + ", versionCode=" + this.f51896b + ", versionName=" + this.f51897c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f51898e + ", developmentPlatformProvider=" + this.f51899f + "}";
    }
}
