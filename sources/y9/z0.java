package y9;
public final class z0 extends b2 {
    public final int f50801a;
    public final String f50802b;
    public final String f50803c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f50801a = i10;
        this.f50802b = str;
        this.f50803c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f50801a == z0Var.f50801a && this.f50802b.equals(z0Var.f50802b) && this.f50803c.equals(z0Var.f50803c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50801a ^ 1000003) * 1000003) ^ this.f50802b.hashCode()) * 1000003) ^ this.f50803c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f50801a + ", version=" + this.f50802b + ", buildVersion=" + this.f50803c + ", jailbroken=" + this.d + "}";
    }
}
