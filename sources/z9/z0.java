package z9;
public final class z0 extends b2 {
    public final int f51515a;
    public final String f51516b;
    public final String f51517c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51515a = i10;
        this.f51516b = str;
        this.f51517c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51515a == z0Var.f51515a && this.f51516b.equals(z0Var.f51516b) && this.f51517c.equals(z0Var.f51517c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51515a ^ 1000003) * 1000003) ^ this.f51516b.hashCode()) * 1000003) ^ this.f51517c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51515a + ", version=" + this.f51516b + ", buildVersion=" + this.f51517c + ", jailbroken=" + this.d + "}";
    }
}
