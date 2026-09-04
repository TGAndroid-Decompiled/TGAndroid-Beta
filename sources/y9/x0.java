package y9;
public final class x0 extends x1 {
    public final String f49911a;
    public final String f49912b;

    public x0(String str, String str2) {
        this.f49911a = str;
        this.f49912b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f49911a.equals(x0Var.f49911a) && this.f49912b.equals(x0Var.f49912b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49911a.hashCode() ^ 1000003) * 1000003) ^ this.f49912b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f49911a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f49912b, "}");
    }
}
