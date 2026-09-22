package y9;
public final class z0 extends b2 {
    public final int f46983a;
    public final String f46984b;
    public final String f46985c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46983a = i10;
        this.f46984b = str;
        this.f46985c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46983a == z0Var.f46983a && this.f46984b.equals(z0Var.f46984b) && this.f46985c.equals(z0Var.f46985c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46983a ^ 1000003) * 1000003) ^ this.f46984b.hashCode()) * 1000003) ^ this.f46985c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46983a + ", version=" + this.f46984b + ", buildVersion=" + this.f46985c + ", jailbroken=" + this.d + "}";
    }
}
