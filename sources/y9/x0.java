package y9;
public final class x0 extends x1 {
    public final String f49940a;
    public final String f49941b;

    public x0(String str, String str2) {
        this.f49940a = str;
        this.f49941b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f49940a.equals(x0Var.f49940a) && this.f49941b.equals(x0Var.f49941b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49940a.hashCode() ^ 1000003) * 1000003) ^ this.f49941b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f49940a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f49941b, "}");
    }
}
