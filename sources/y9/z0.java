package y9;
public final class z0 extends b2 {
    public final int f46810a;
    public final String f46811b;
    public final String f46812c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46810a = i10;
        this.f46811b = str;
        this.f46812c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46810a == z0Var.f46810a && this.f46811b.equals(z0Var.f46811b) && this.f46812c.equals(z0Var.f46812c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46810a ^ 1000003) * 1000003) ^ this.f46811b.hashCode()) * 1000003) ^ this.f46812c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46810a + ", version=" + this.f46811b + ", buildVersion=" + this.f46812c + ", jailbroken=" + this.d + "}";
    }
}
