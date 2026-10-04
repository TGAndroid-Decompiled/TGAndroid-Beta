package y9;
public final class x0 extends x1 {
    public final String f50792a;
    public final String f50793b;

    public x0(String str, String str2) {
        this.f50792a = str;
        this.f50793b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50792a.equals(x0Var.f50792a) && this.f50793b.equals(x0Var.f50793b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50792a.hashCode() ^ 1000003) * 1000003) ^ this.f50793b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50792a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f50793b, "}");
    }
}
