package y9;
public final class z0 extends b2 {
    public final int f49950a;
    public final String f49951b;
    public final String f49952c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f49950a = i10;
        this.f49951b = str;
        this.f49952c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f49950a == z0Var.f49950a && this.f49951b.equals(z0Var.f49951b) && this.f49952c.equals(z0Var.f49952c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49950a ^ 1000003) * 1000003) ^ this.f49951b.hashCode()) * 1000003) ^ this.f49952c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f49950a + ", version=" + this.f49951b + ", buildVersion=" + this.f49952c + ", jailbroken=" + this.d + "}";
    }
}
