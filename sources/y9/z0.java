package y9;
public final class z0 extends b2 {
    public final int f49949a;
    public final String f49950b;
    public final String f49951c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f49949a = i10;
        this.f49950b = str;
        this.f49951c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f49949a == z0Var.f49949a && this.f49950b.equals(z0Var.f49950b) && this.f49951c.equals(z0Var.f49951c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49949a ^ 1000003) * 1000003) ^ this.f49950b.hashCode()) * 1000003) ^ this.f49951c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f49949a + ", version=" + this.f49950b + ", buildVersion=" + this.f49951c + ", jailbroken=" + this.d + "}";
    }
}
