package y9;
public final class x0 extends x1 {
    public final String f46606a;
    public final String f46607b;

    public x0(String str, String str2) {
        this.f46606a = str;
        this.f46607b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46606a.equals(x0Var.f46606a) && this.f46607b.equals(x0Var.f46607b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46606a.hashCode() ^ 1000003) * 1000003) ^ this.f46607b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46606a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f46607b, "}");
    }
}
