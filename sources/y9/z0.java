package y9;
public final class z0 extends b2 {
    public final int f46962a;
    public final String f46963b;
    public final String f46964c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f46962a = i10;
        this.f46963b = str;
        this.f46964c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f46962a == z0Var.f46962a && this.f46963b.equals(z0Var.f46963b) && this.f46964c.equals(z0Var.f46964c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46962a ^ 1000003) * 1000003) ^ this.f46963b.hashCode()) * 1000003) ^ this.f46964c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f46962a + ", version=" + this.f46963b + ", buildVersion=" + this.f46964c + ", jailbroken=" + this.d + "}";
    }
}
