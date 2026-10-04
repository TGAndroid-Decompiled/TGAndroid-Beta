package y9;
public final class z0 extends b2 {
    public final int f50810a;
    public final String f50811b;
    public final String f50812c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f50810a = i10;
        this.f50811b = str;
        this.f50812c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f50810a == z0Var.f50810a && this.f50811b.equals(z0Var.f50811b) && this.f50812c.equals(z0Var.f50812c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50810a ^ 1000003) * 1000003) ^ this.f50811b.hashCode()) * 1000003) ^ this.f50812c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f50810a + ", version=" + this.f50811b + ", buildVersion=" + this.f50812c + ", jailbroken=" + this.d + "}";
    }
}
