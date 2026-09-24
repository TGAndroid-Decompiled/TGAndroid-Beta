package y9;
public final class c1 {
    public final String f46751a;
    public final String f46752b;
    public final String f46753c;
    public final String d;
    public final int e;
    public final n7.z0 f46754f;

    public c1(String str, String str2, String str3, String str4, int i10, n7.z0 z0Var) {
        if (str != null) {
            this.f46751a = str;
            if (str2 != null) {
                this.f46752b = str2;
                if (str3 != null) {
                    this.f46753c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46754f = z0Var;
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
                if (this.f46751a.equals(c1Var.f46751a) && this.f46752b.equals(c1Var.f46752b) && this.f46753c.equals(c1Var.f46753c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46754f.equals(c1Var.f46754f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46751a.hashCode() ^ 1000003) * 1000003) ^ this.f46752b.hashCode()) * 1000003) ^ this.f46753c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46754f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46751a + ", versionCode=" + this.f46752b + ", versionName=" + this.f46753c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46754f + "}";
    }
}
