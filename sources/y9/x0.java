package y9;
public final class x0 extends x1 {
    public final String f46680a;
    public final String f46681b;

    public x0(String str, String str2) {
        this.f46680a = str;
        this.f46681b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46680a.equals(x0Var.f46680a) && this.f46681b.equals(x0Var.f46681b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46680a.hashCode() ^ 1000003) * 1000003) ^ this.f46681b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46680a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f46681b, "}");
    }
}
