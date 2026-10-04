package y9;
public final class x0 extends x1 {
    public final String f50801a;
    public final String f50802b;

    public x0(String str, String str2) {
        this.f50801a = str;
        this.f50802b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50801a.equals(x0Var.f50801a) && this.f50802b.equals(x0Var.f50802b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50801a.hashCode() ^ 1000003) * 1000003) ^ this.f50802b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50801a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f50802b, "}");
    }
}
