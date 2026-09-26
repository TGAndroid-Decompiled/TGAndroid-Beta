package y9;
public final class z0 extends b2 {
    public final int f46938a;
    public final String f46939b;
    public final String f46940c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46938a = i10;
        this.f46939b = str;
        this.f46940c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46938a == z0Var.f46938a && this.f46939b.equals(z0Var.f46939b) && this.f46940c.equals(z0Var.f46940c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46938a ^ 1000003) * 1000003) ^ this.f46939b.hashCode()) * 1000003) ^ this.f46940c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46938a + ", version=" + this.f46939b + ", buildVersion=" + this.f46940c + ", jailbroken=" + this.d + "}";
    }
}
