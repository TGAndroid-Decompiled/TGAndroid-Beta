package y9;
public final class d0 extends h1 {
    public final String f51954a;
    public final String f51955b;

    public d0(String str, String str2) {
        this.f51954a = str;
        this.f51955b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f51954a.equals(d0Var.f51954a) && this.f51955b.equals(d0Var.f51955b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51954a.hashCode() ^ 1000003) * 1000003) ^ this.f51955b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f51954a);
        sb2.append(", value=");
        return a1.g.t(sb2, this.f51955b, "}");
    }
}
