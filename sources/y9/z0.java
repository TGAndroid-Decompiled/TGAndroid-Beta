package y9;
public final class z0 extends b2 {
    public final int f46928a;
    public final String f46929b;
    public final String f46930c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46928a = i10;
        this.f46929b = str;
        this.f46930c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46928a == z0Var.f46928a && this.f46929b.equals(z0Var.f46929b) && this.f46930c.equals(z0Var.f46930c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46928a ^ 1000003) * 1000003) ^ this.f46929b.hashCode()) * 1000003) ^ this.f46930c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46928a + ", version=" + this.f46929b + ", buildVersion=" + this.f46930c + ", jailbroken=" + this.d + "}";
    }
}
