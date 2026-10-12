package y9;
public final class x0 extends x1 {
    public final String f52313a;
    public final String f52314b;

    public x0(String str, String str2) {
        this.f52313a = str;
        this.f52314b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f52313a.equals(x0Var.f52313a) && this.f52314b.equals(x0Var.f52314b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52313a.hashCode() ^ 1000003) * 1000003) ^ this.f52314b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f52313a);
        sb2.append(", variantId=");
        return a1.g.t(sb2, this.f52314b, "}");
    }
}
