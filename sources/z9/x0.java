package z9;
public final class x0 extends x1 {
    public final String f50112a;
    public final String f50113b;

    public x0(String str, String str2) {
        this.f50112a = str;
        this.f50113b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50112a.equals(x0Var.f50112a) && this.f50113b.equals(x0Var.f50113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50112a.hashCode() ^ 1000003) * 1000003) ^ this.f50113b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50112a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f50113b, "}");
    }
}
