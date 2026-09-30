package y9;
public final class x0 extends x1 {
    public final String f46933a;
    public final String f46934b;

    public x0(String str, String str2) {
        this.f46933a = str;
        this.f46934b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46933a.equals(x0Var.f46933a) && this.f46934b.equals(x0Var.f46934b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46933a.hashCode() ^ 1000003) * 1000003) ^ this.f46934b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46933a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f46934b, "}");
    }
}
