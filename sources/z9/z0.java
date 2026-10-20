package z9;
public final class z0 extends b2 {
    public final int f51511a;
    public final String f51512b;
    public final String f51513c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51511a = i10;
        this.f51512b = str;
        this.f51513c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51511a == z0Var.f51511a && this.f51512b.equals(z0Var.f51512b) && this.f51513c.equals(z0Var.f51513c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51511a ^ 1000003) * 1000003) ^ this.f51512b.hashCode()) * 1000003) ^ this.f51513c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51511a + ", version=" + this.f51512b + ", buildVersion=" + this.f51513c + ", jailbroken=" + this.d + "}";
    }
}
