package y9;
public final class x0 extends x1 {
    public final String f46652a;
    public final String f46653b;

    public x0(String str, String str2) {
        this.f46652a = str;
        this.f46653b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f46652a.equals(x0Var.f46652a) && this.f46653b.equals(x0Var.f46653b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46652a.hashCode() ^ 1000003) * 1000003) ^ this.f46653b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f46652a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f46653b, "}");
    }
}
