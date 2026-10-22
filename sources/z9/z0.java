package z9;
public final class z0 extends b2 {
    public final int f51514a;
    public final String f51515b;
    public final String f51516c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51514a = i10;
        this.f51515b = str;
        this.f51516c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51514a == z0Var.f51514a && this.f51515b.equals(z0Var.f51515b) && this.f51516c.equals(z0Var.f51516c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51514a ^ 1000003) * 1000003) ^ this.f51515b.hashCode()) * 1000003) ^ this.f51516c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51514a + ", version=" + this.f51515b + ", buildVersion=" + this.f51516c + ", jailbroken=" + this.d + "}";
    }
}
