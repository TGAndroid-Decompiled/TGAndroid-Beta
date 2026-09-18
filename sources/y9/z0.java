package y9;
public final class z0 extends b2 {
    public final int f46915a;
    public final String f46916b;
    public final String f46917c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46915a = i10;
        this.f46916b = str;
        this.f46917c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46915a == z0Var.f46915a && this.f46916b.equals(z0Var.f46916b) && this.f46917c.equals(z0Var.f46917c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46915a ^ 1000003) * 1000003) ^ this.f46916b.hashCode()) * 1000003) ^ this.f46917c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46915a + ", version=" + this.f46916b + ", buildVersion=" + this.f46917c + ", jailbroken=" + this.d + "}";
    }
}
