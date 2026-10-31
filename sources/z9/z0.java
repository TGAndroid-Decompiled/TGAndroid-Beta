package z9;
public final class z0 extends b2 {
    public final int f55423a;
    public final String f55424b;
    public final String f55425c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f55423a = i10;
        this.f55424b = str;
        this.f55425c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f55423a == z0Var.f55423a && this.f55424b.equals(z0Var.f55424b) && this.f55425c.equals(z0Var.f55425c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f55423a ^ 1000003) * 1000003) ^ this.f55424b.hashCode()) * 1000003) ^ this.f55425c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f55423a + ", version=" + this.f55424b + ", buildVersion=" + this.f55425c + ", jailbroken=" + this.d + "}";
    }
}
