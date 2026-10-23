package z9;
public final class z0 extends b2 {
    public final int f51976a;
    public final String f51977b;
    public final String f51978c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51976a = i10;
        this.f51977b = str;
        this.f51978c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51976a == z0Var.f51976a && this.f51977b.equals(z0Var.f51977b) && this.f51978c.equals(z0Var.f51978c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51976a ^ 1000003) * 1000003) ^ this.f51977b.hashCode()) * 1000003) ^ this.f51978c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51976a + ", version=" + this.f51977b + ", buildVersion=" + this.f51978c + ", jailbroken=" + this.d + "}";
    }
}
