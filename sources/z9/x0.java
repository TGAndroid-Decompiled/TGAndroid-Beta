package z9;
public final class x0 extends x1 {
    public final String f55433a;
    public final String f55434b;

    public x0(String str, String str2) {
        this.f55433a = str;
        this.f55434b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f55433a.equals(x0Var.f55433a) && this.f55434b.equals(x0Var.f55434b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55433a.hashCode() ^ 1000003) * 1000003) ^ this.f55434b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f55433a);
        sb2.append(", variantId=");
        return a1.g.r(sb2, this.f55434b, "}");
    }
}
