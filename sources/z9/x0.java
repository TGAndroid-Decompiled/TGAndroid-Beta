package z9;
public final class x0 extends x1 {
    public final String f51543a;
    public final String f51544b;

    public x0(String str, String str2) {
        this.f51543a = str;
        this.f51544b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f51543a.equals(x0Var.f51543a) && this.f51544b.equals(x0Var.f51544b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51543a.hashCode() ^ 1000003) * 1000003) ^ this.f51544b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f51543a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f51544b, "}");
    }
}
