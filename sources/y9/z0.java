package y9;
public final class z0 extends b2 {
    public final int f52098a;
    public final String f52099b;
    public final String f52100c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52098a = i10;
        this.f52099b = str;
        this.f52100c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52098a == z0Var.f52098a && this.f52099b.equals(z0Var.f52099b) && this.f52100c.equals(z0Var.f52100c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52098a ^ 1000003) * 1000003) ^ this.f52099b.hashCode()) * 1000003) ^ this.f52100c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52098a + ", version=" + this.f52099b + ", buildVersion=" + this.f52100c + ", jailbroken=" + this.d + "}";
    }
}
