package z9;
public final class x0 extends x1 {
    public final String f51498a;
    public final String f51499b;

    public x0(String str, String str2) {
        this.f51498a = str;
        this.f51499b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f51498a.equals(x0Var.f51498a) && this.f51499b.equals(x0Var.f51499b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51498a.hashCode() ^ 1000003) * 1000003) ^ this.f51499b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f51498a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f51499b, "}");
    }
}
