package y9;
public final class x0 extends x1 {
    public final String f50793a;
    public final String f50794b;

    public x0(String str, String str2) {
        this.f50793a = str;
        this.f50794b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50793a.equals(x0Var.f50793a) && this.f50794b.equals(x0Var.f50794b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50793a.hashCode() ^ 1000003) * 1000003) ^ this.f50794b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50793a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f50794b, "}");
    }
}
