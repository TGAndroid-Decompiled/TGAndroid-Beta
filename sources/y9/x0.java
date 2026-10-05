package y9;
public final class x0 extends x1 {
    public final String f50808a;
    public final String f50809b;

    public x0(String str, String str2) {
        this.f50808a = str;
        this.f50809b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50808a.equals(x0Var.f50808a) && this.f50809b.equals(x0Var.f50809b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50808a.hashCode() ^ 1000003) * 1000003) ^ this.f50809b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50808a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f50809b, "}");
    }
}
