package y9;
public final class z0 extends b2 {
    public final int f46688a;
    public final String f46689b;
    public final String f46690c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46688a = i10;
        this.f46689b = str;
        this.f46690c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46688a == z0Var.f46688a && this.f46689b.equals(z0Var.f46689b) && this.f46690c.equals(z0Var.f46690c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46688a ^ 1000003) * 1000003) ^ this.f46689b.hashCode()) * 1000003) ^ this.f46690c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46688a + ", version=" + this.f46689b + ", buildVersion=" + this.f46690c + ", jailbroken=" + this.d + "}";
    }
}
