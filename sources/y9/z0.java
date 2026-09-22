package y9;
public final class z0 extends b2 {
    public final int f46656a;
    public final String f46657b;
    public final String f46658c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46656a = i10;
        this.f46657b = str;
        this.f46658c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46656a == z0Var.f46656a && this.f46657b.equals(z0Var.f46657b) && this.f46658c.equals(z0Var.f46658c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46656a ^ 1000003) * 1000003) ^ this.f46657b.hashCode()) * 1000003) ^ this.f46658c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46656a + ", version=" + this.f46657b + ", buildVersion=" + this.f46658c + ", jailbroken=" + this.d + "}";
    }
}
