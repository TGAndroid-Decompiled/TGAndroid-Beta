package y9;
public final class x0 extends x1 {
    public final String f52089a;
    public final String f52090b;

    public x0(String str, String str2) {
        this.f52089a = str;
        this.f52090b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f52089a.equals(x0Var.f52089a) && this.f52090b.equals(x0Var.f52090b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52089a.hashCode() ^ 1000003) * 1000003) ^ this.f52090b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f52089a);
        sb2.append(", variantId=");
        return a1.g.t(sb2, this.f52090b, "}");
    }
}
