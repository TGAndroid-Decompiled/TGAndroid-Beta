package y9;
public final class z0 extends b2 {
    public final int f46941a;
    public final String f46942b;
    public final String f46943c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46941a = i10;
        this.f46942b = str;
        this.f46943c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46941a == z0Var.f46941a && this.f46942b.equals(z0Var.f46942b) && this.f46943c.equals(z0Var.f46943c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46941a ^ 1000003) * 1000003) ^ this.f46942b.hashCode()) * 1000003) ^ this.f46943c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46941a + ", version=" + this.f46942b + ", buildVersion=" + this.f46943c + ", jailbroken=" + this.d + "}";
    }
}
