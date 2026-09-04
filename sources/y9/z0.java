package y9;
public final class z0 extends b2 {
    public final int f49920a;
    public final String f49921b;
    public final String f49922c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f49920a = i10;
        this.f49921b = str;
        this.f49922c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f49920a == z0Var.f49920a && this.f49921b.equals(z0Var.f49921b) && this.f49922c.equals(z0Var.f49922c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49920a ^ 1000003) * 1000003) ^ this.f49921b.hashCode()) * 1000003) ^ this.f49922c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f49920a + ", version=" + this.f49921b + ", buildVersion=" + this.f49922c + ", jailbroken=" + this.d + "}";
    }
}
