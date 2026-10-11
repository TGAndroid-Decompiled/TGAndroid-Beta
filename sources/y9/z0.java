package y9;
public final class z0 extends b2 {
    public final int f52219a;
    public final String f52220b;
    public final String f52221c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52219a = i10;
        this.f52220b = str;
        this.f52221c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52219a == z0Var.f52219a && this.f52220b.equals(z0Var.f52220b) && this.f52221c.equals(z0Var.f52221c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52219a ^ 1000003) * 1000003) ^ this.f52220b.hashCode()) * 1000003) ^ this.f52221c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52219a + ", version=" + this.f52220b + ", buildVersion=" + this.f52221c + ", jailbroken=" + this.d + "}";
    }
}
