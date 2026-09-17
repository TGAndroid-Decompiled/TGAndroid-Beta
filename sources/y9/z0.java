package y9;
public final class z0 extends b2 {
    public final int f46683a;
    public final String f46684b;
    public final String f46685c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46683a = i10;
        this.f46684b = str;
        this.f46685c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46683a == z0Var.f46683a && this.f46684b.equals(z0Var.f46684b) && this.f46685c.equals(z0Var.f46685c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46683a ^ 1000003) * 1000003) ^ this.f46684b.hashCode()) * 1000003) ^ this.f46685c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46683a + ", version=" + this.f46684b + ", buildVersion=" + this.f46685c + ", jailbroken=" + this.d + "}";
    }
}
