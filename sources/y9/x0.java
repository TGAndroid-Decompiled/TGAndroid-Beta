package y9;
public final class x0 extends x1 {
    public final String f46802a;
    public final String f46803b;

    public x0(String str, String str2) {
        this.f46802a = str;
        this.f46803b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46802a.equals(x0Var.f46802a) && this.f46803b.equals(x0Var.f46803b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46802a.hashCode() ^ 1000003) * 1000003) ^ this.f46803b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46802a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f46803b, "}");
    }
}
