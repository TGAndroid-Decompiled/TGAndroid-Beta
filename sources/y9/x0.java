package y9;
public final class x0 extends x1 {
    public final String f52133a;
    public final String f52134b;

    public x0(String str, String str2) {
        this.f52133a = str;
        this.f52134b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f52133a.equals(x0Var.f52133a) && this.f52134b.equals(x0Var.f52134b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52133a.hashCode() ^ 1000003) * 1000003) ^ this.f52134b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f52133a);
        sb2.append(", variantId=");
        return a1.g.t(sb2, this.f52134b, "}");
    }
}
