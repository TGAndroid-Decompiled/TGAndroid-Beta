package y9;
public final class z0 extends b2 {
    public final int f46939a;
    public final String f46940b;
    public final String f46941c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46939a = i10;
        this.f46940b = str;
        this.f46941c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46939a == z0Var.f46939a && this.f46940b.equals(z0Var.f46940b) && this.f46941c.equals(z0Var.f46941c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46939a ^ 1000003) * 1000003) ^ this.f46940b.hashCode()) * 1000003) ^ this.f46941c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46939a + ", version=" + this.f46940b + ", buildVersion=" + this.f46941c + ", jailbroken=" + this.d + "}";
    }
}
