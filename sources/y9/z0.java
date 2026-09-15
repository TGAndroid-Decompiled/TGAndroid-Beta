package y9;
public final class z0 extends b2 {
    public final int f46660a;
    public final String f46661b;
    public final String f46662c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46660a = i10;
        this.f46661b = str;
        this.f46662c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46660a == z0Var.f46660a && this.f46661b.equals(z0Var.f46661b) && this.f46662c.equals(z0Var.f46662c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46660a ^ 1000003) * 1000003) ^ this.f46661b.hashCode()) * 1000003) ^ this.f46662c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46660a + ", version=" + this.f46661b + ", buildVersion=" + this.f46662c + ", jailbroken=" + this.d + "}";
    }
}
