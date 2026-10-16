package z9;
public final class x0 extends x1 {
    public final String f50113a;
    public final String f50114b;

    public x0(String str, String str2) {
        this.f50113a = str;
        this.f50114b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f50113a.equals(x0Var.f50113a) && this.f50114b.equals(x0Var.f50114b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50113a.hashCode() ^ 1000003) * 1000003) ^ this.f50114b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f50113a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f50114b, "}");
    }
}
