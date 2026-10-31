package z9;
public final class x0 extends x1 {
    public final String f55415a;
    public final String f55416b;

    public x0(String str, String str2) {
        this.f55415a = str;
        this.f55416b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f55415a.equals(x0Var.f55415a) && this.f55416b.equals(x0Var.f55416b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55415a.hashCode() ^ 1000003) * 1000003) ^ this.f55416b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f55415a);
        sb2.append(", variantId=");
        return a1.g.r(sb2, this.f55416b, "}");
    }
}
