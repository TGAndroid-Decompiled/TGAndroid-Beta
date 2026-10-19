package z9;
public final class z0 extends b2 {
    public final int f51506a;
    public final String f51507b;
    public final String f51508c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51506a = i10;
        this.f51507b = str;
        this.f51508c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51506a == z0Var.f51506a && this.f51507b.equals(z0Var.f51507b) && this.f51508c.equals(z0Var.f51508c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51506a ^ 1000003) * 1000003) ^ this.f51507b.hashCode()) * 1000003) ^ this.f51508c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51506a + ", version=" + this.f51507b + ", buildVersion=" + this.f51508c + ", jailbroken=" + this.d + "}";
    }
}
