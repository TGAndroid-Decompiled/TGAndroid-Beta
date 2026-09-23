package y9;
public final class z0 extends b2 {
    public final int f46614a;
    public final String f46615b;
    public final String f46616c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46614a = i10;
        this.f46615b = str;
        this.f46616c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46614a == z0Var.f46614a && this.f46615b.equals(z0Var.f46615b) && this.f46616c.equals(z0Var.f46616c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46614a ^ 1000003) * 1000003) ^ this.f46615b.hashCode()) * 1000003) ^ this.f46616c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46614a + ", version=" + this.f46615b + ", buildVersion=" + this.f46616c + ", jailbroken=" + this.d + "}";
    }
}
