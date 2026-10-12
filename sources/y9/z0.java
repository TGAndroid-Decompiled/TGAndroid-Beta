package y9;
public final class z0 extends b2 {
    public final int f52322a;
    public final String f52323b;
    public final String f52324c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52322a = i10;
        this.f52323b = str;
        this.f52324c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52322a == z0Var.f52322a && this.f52323b.equals(z0Var.f52323b) && this.f52324c.equals(z0Var.f52324c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52322a ^ 1000003) * 1000003) ^ this.f52323b.hashCode()) * 1000003) ^ this.f52324c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52322a + ", version=" + this.f52323b + ", buildVersion=" + this.f52324c + ", jailbroken=" + this.d + "}";
    }
}
