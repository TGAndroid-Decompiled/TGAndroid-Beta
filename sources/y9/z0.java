package y9;
public final class z0 extends b2 {
    public final int f47047a;
    public final String f47048b;
    public final String f47049c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f47047a = i10;
        this.f47048b = str;
        this.f47049c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f47047a == z0Var.f47047a && this.f47048b.equals(z0Var.f47048b) && this.f47049c.equals(z0Var.f47049c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f47047a ^ 1000003) * 1000003) ^ this.f47048b.hashCode()) * 1000003) ^ this.f47049c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f47047a + ", version=" + this.f47048b + ", buildVersion=" + this.f47049c + ", jailbroken=" + this.d + "}";
    }
}
