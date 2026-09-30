package y9;
public final class x0 extends x1 {
    public final String f47039a;
    public final String f47040b;

    public x0(String str, String str2) {
        this.f47039a = str;
        this.f47040b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f47039a.equals(x0Var.f47039a) && this.f47040b.equals(x0Var.f47040b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f47039a.hashCode() ^ 1000003) * 1000003) ^ this.f47040b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f47039a);
        sb2.append(", variantId=");
        return a4.a.t(sb2, this.f47040b, "}");
    }
}
