package z9;
public final class x0 extends x1 {
    public final String f51518a;
    public final String f51519b;

    public x0(String str, String str2) {
        this.f51518a = str;
        this.f51519b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f51518a.equals(x0Var.f51518a) && this.f51519b.equals(x0Var.f51519b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51518a.hashCode() ^ 1000003) * 1000003) ^ this.f51519b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f51518a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f51519b, "}");
    }
}
