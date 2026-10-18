package z9;
public final class z0 extends b2 {
    public final int f51551a;
    public final String f51552b;
    public final String f51553c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f51551a = i10;
        this.f51552b = str;
        this.f51553c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f51551a == z0Var.f51551a && this.f51552b.equals(z0Var.f51552b) && this.f51553c.equals(z0Var.f51553c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51551a ^ 1000003) * 1000003) ^ this.f51552b.hashCode()) * 1000003) ^ this.f51553c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f51551a + ", version=" + this.f51552b + ", buildVersion=" + this.f51553c + ", jailbroken=" + this.d + "}";
    }
}
