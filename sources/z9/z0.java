package z9;
public final class z0 extends b2 {
    public final int f51504a;
    public final String f51505b;
    public final String f51506c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51504a = i10;
        this.f51505b = str;
        this.f51506c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51504a == z0Var.f51504a && this.f51505b.equals(z0Var.f51505b) && this.f51506c.equals(z0Var.f51506c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51504a ^ 1000003) * 1000003) ^ this.f51505b.hashCode()) * 1000003) ^ this.f51506c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51504a + ", version=" + this.f51505b + ", buildVersion=" + this.f51506c + ", jailbroken=" + this.d + "}";
    }
}
