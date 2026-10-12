package y9;
public final class z0 extends b2 {
    public final int f52330a;
    public final String f52331b;
    public final String f52332c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52330a = i10;
        this.f52331b = str;
        this.f52332c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52330a == z0Var.f52330a && this.f52331b.equals(z0Var.f52331b) && this.f52332c.equals(z0Var.f52332c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52330a ^ 1000003) * 1000003) ^ this.f52331b.hashCode()) * 1000003) ^ this.f52332c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52330a + ", version=" + this.f52331b + ", buildVersion=" + this.f52332c + ", jailbroken=" + this.d + "}";
    }
}
