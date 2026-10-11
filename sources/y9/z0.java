package y9;
public final class z0 extends b2 {
    public final int f52185a;
    public final String f52186b;
    public final String f52187c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52185a = i10;
        this.f52186b = str;
        this.f52187c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52185a == z0Var.f52185a && this.f52186b.equals(z0Var.f52186b) && this.f52187c.equals(z0Var.f52187c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52185a ^ 1000003) * 1000003) ^ this.f52186b.hashCode()) * 1000003) ^ this.f52187c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52185a + ", version=" + this.f52186b + ", buildVersion=" + this.f52187c + ", jailbroken=" + this.d + "}";
    }
}
