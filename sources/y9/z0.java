package y9;
public final class z0 extends b2 {
    public final int f50817a;
    public final String f50818b;
    public final String f50819c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f50817a = i10;
        this.f50818b = str;
        this.f50819c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f50817a == z0Var.f50817a && this.f50818b.equals(z0Var.f50818b) && this.f50819c.equals(z0Var.f50819c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50817a ^ 1000003) * 1000003) ^ this.f50818b.hashCode()) * 1000003) ^ this.f50819c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f50817a + ", version=" + this.f50818b + ", buildVersion=" + this.f50819c + ", jailbroken=" + this.d + "}";
    }
}
