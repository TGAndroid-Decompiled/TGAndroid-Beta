package y9;
public final class z0 extends b2 {
    public final int f52142a;
    public final String f52143b;
    public final String f52144c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52142a = i10;
        this.f52143b = str;
        this.f52144c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52142a == z0Var.f52142a && this.f52143b.equals(z0Var.f52143b) && this.f52144c.equals(z0Var.f52144c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52142a ^ 1000003) * 1000003) ^ this.f52143b.hashCode()) * 1000003) ^ this.f52144c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52142a + ", version=" + this.f52143b + ", buildVersion=" + this.f52144c + ", jailbroken=" + this.d + "}";
    }
}
