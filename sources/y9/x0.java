package y9;
public final class x0 extends x1 {
    public final String f46920a;
    public final String f46921b;

    public x0(String str, String str2) {
        this.f46920a = str;
        this.f46921b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46920a.equals(x0Var.f46920a) && this.f46921b.equals(x0Var.f46921b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46920a.hashCode() ^ 1000003) * 1000003) ^ this.f46921b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46920a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f46921b, "}");
    }
}
