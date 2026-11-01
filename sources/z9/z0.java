package z9;
public final class z0 extends b2 {
    public final int f55441a;
    public final String f55442b;
    public final String f55443c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f55441a = i10;
        this.f55442b = str;
        this.f55443c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f55441a == z0Var.f55441a && this.f55442b.equals(z0Var.f55442b) && this.f55443c.equals(z0Var.f55443c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f55441a ^ 1000003) * 1000003) ^ this.f55442b.hashCode()) * 1000003) ^ this.f55443c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f55441a + ", version=" + this.f55442b + ", buildVersion=" + this.f55443c + ", jailbroken=" + this.d + "}";
    }
}
