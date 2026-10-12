package z9;
public final class z0 extends b2 {
    public final int f50120a;
    public final String f50121b;
    public final String f50122c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f50120a = i10;
        this.f50121b = str;
        this.f50122c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f50120a == z0Var.f50120a && this.f50121b.equals(z0Var.f50121b) && this.f50122c.equals(z0Var.f50122c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50120a ^ 1000003) * 1000003) ^ this.f50121b.hashCode()) * 1000003) ^ this.f50122c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f50120a + ", version=" + this.f50121b + ", buildVersion=" + this.f50122c + ", jailbroken=" + this.d + "}";
    }
}
