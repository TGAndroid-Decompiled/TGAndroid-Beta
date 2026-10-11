package y9;
public final class x0 extends x1 {
    public final String f52176a;
    public final String f52177b;

    public x0(String str, String str2) {
        this.f52176a = str;
        this.f52177b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f52176a.equals(x0Var.f52176a) && this.f52177b.equals(x0Var.f52177b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52176a.hashCode() ^ 1000003) * 1000003) ^ this.f52177b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f52176a);
        sb2.append(", variantId=");
        return a1.g.t(sb2, this.f52177b, "}");
    }
}
