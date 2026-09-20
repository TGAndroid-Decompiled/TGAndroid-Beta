package y9;
public final class x0 extends x1 {
    public final String f46954a;
    public final String f46955b;

    public x0(String str, String str2) {
        this.f46954a = str;
        this.f46955b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46954a.equals(x0Var.f46954a) && this.f46955b.equals(x0Var.f46955b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46954a.hashCode() ^ 1000003) * 1000003) ^ this.f46955b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46954a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f46955b, "}");
    }
}
