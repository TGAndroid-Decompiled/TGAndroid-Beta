package y9;
public final class x0 extends x1 {
    public final String f46675a;
    public final String f46676b;

    public x0(String str, String str2) {
        this.f46675a = str;
        this.f46676b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46675a.equals(x0Var.f46675a) && this.f46676b.equals(x0Var.f46676b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46675a.hashCode() ^ 1000003) * 1000003) ^ this.f46676b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46675a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f46676b, "}");
    }
}
