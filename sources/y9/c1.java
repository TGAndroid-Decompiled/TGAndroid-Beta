package y9;
public final class c1 {
    public final String f50598a;
    public final String f50599b;
    public final String f50600c;
    public final String d;
    public final int f50601e;
    public final n7.z0 f50602f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f50598a = str;
            if (str2 != null) {
                this.f50599b = str2;
                if (str3 != null) {
                    this.f50600c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f50601e = i10;
                        this.f50602f = z0Var;
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
                if (this.f50598a.equals(c1Var.f50598a) && this.f50599b.equals(c1Var.f50599b) && this.f50600c.equals(c1Var.f50600c) && this.d.equals(c1Var.d) && this.f50601e == c1Var.f50601e && this.f50602f.equals(c1Var.f50602f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f50598a.hashCode() ^ 1000003) * 1000003) ^ this.f50599b.hashCode()) * 1000003) ^ this.f50600c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f50601e) * 1000003) ^ this.f50602f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f50598a + ", versionCode=" + this.f50599b + ", versionName=" + this.f50600c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f50601e + ", developmentPlatformProvider=" + this.f50602f + "}";
    }
}
