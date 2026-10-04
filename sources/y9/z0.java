package y9;
public final class z0 extends b2 {
    public final int f50802a;
    public final String f50803b;
    public final String f50804c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f50802a = i10;
        this.f50803b = str;
        this.f50804c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f50802a == z0Var.f50802a && this.f50803b.equals(z0Var.f50803b) && this.f50804c.equals(z0Var.f50804c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50802a ^ 1000003) * 1000003) ^ this.f50803b.hashCode()) * 1000003) ^ this.f50804c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f50802a + ", version=" + this.f50803b + ", buildVersion=" + this.f50804c + ", jailbroken=" + this.d + "}";
    }
}
