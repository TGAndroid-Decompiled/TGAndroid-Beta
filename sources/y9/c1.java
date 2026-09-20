package y9;

import org.telegram.ui.Cells.f3;
public final class c1 {
    public final String f46785a;
    public final String f46786b;
    public final String f46787c;
    public final String d;
    public final int e;
    public final f3 f46788f;

    public c1(String str, String str2, String str3, String str4, int i10, f3 f3Var) {
        if (str != null) {
            this.f46785a = str;
            if (str2 != null) {
                this.f46786b = str2;
                if (str3 != null) {
                    this.f46787c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f46788f = f3Var;
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
                if (this.f46785a.equals(c1Var.f46785a) && this.f46786b.equals(c1Var.f46786b) && this.f46787c.equals(c1Var.f46787c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f46788f.equals(c1Var.f46788f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f46785a.hashCode() ^ 1000003) * 1000003) ^ this.f46786b.hashCode()) * 1000003) ^ this.f46787c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f46788f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f46785a + ", versionCode=" + this.f46786b + ", versionName=" + this.f46787c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f46788f + "}";
    }
}
