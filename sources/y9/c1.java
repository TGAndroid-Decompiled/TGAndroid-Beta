package y9;
public final class c1 {
    public final String f46483a;
    public final String f46484b;
    public final String f46485c;
    public final String d;
    public final int e;
    public final n7.a1 f46486f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.a1 a1Var) {
        if (str != null) {
            this.f46483a = str;
            if (str2 != null) {
                this.f46484b = str2;
                if (str3 != null) {
                    this.f46485c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46486f = a1Var;
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
                if (this.f46483a.equals(c1Var.f46483a) && this.f46484b.equals(c1Var.f46484b) && this.f46485c.equals(c1Var.f46485c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46486f.equals(c1Var.f46486f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46483a.hashCode() ^ 1000003) * 1000003) ^ this.f46484b.hashCode()) * 1000003) ^ this.f46485c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46486f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46483a + ", versionCode=" + this.f46484b + ", versionName=" + this.f46485c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46486f + "}";
    }
}
