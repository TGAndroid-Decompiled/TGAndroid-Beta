package y9;
public final class z0 extends b2 {
    public final int f52096a;
    public final String f52097b;
    public final String f52098c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f52096a = i10;
        this.f52097b = str;
        this.f52098c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f52096a == z0Var.f52096a && this.f52097b.equals(z0Var.f52097b) && this.f52098c.equals(z0Var.f52098c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52096a ^ 1000003) * 1000003) ^ this.f52097b.hashCode()) * 1000003) ^ this.f52098c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f52096a + ", version=" + this.f52097b + ", buildVersion=" + this.f52098c + ", jailbroken=" + this.d + "}";
    }
}
