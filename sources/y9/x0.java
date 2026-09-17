package y9;
public final class x0 extends x1 {
    public final String f49941a;
    public final String f49942b;

    public x0(String str, String str2) {
        this.f49941a = str;
        this.f49942b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f49941a.equals(x0Var.f49941a) && this.f49942b.equals(x0Var.f49942b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49941a.hashCode() ^ 1000003) * 1000003) ^ this.f49942b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f49941a);
        sb2.append(", variantId=");
        return a4.a.s(sb2, this.f49942b, "}");
    }
}
