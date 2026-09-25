package y9;
public final class x0 extends x1 {
    public final String f46932a;
    public final String f46933b;

    public x0(String str, String str2) {
        this.f46932a = str;
        this.f46933b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46932a.equals(x0Var.f46932a) && this.f46933b.equals(x0Var.f46933b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46932a.hashCode() ^ 1000003) * 1000003) ^ this.f46933b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46932a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f46933b, "}");
    }
}
