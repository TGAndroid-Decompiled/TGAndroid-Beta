package y9;
public final class c1 {
    public final String f51893a;
    public final String f51894b;
    public final String f51895c;
    public final String d;
    public final int f51896e;
    public final n6.t f51897f;

    public c1(String str, String str2, String str3, String str4, int i10, n6.t tVar) {
        if (str != null) {
            this.f51893a = str;
            if (str2 != null) {
                this.f51894b = str2;
                if (str3 != null) {
                    this.f51895c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f51896e = i10;
                        this.f51897f = tVar;
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
                if (this.f51893a.equals(c1Var.f51893a) && this.f51894b.equals(c1Var.f51894b) && this.f51895c.equals(c1Var.f51895c) && this.d.equals(c1Var.d) && this.f51896e == c1Var.f51896e && this.f51897f.equals(c1Var.f51897f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f51893a.hashCode() ^ 1000003) * 1000003) ^ this.f51894b.hashCode()) * 1000003) ^ this.f51895c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51896e) * 1000003) ^ this.f51897f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f51893a + ", versionCode=" + this.f51894b + ", versionName=" + this.f51895c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f51896e + ", developmentPlatformProvider=" + this.f51897f + "}";
    }
}
