package y9;
public final class d0 extends h1 {
    public final String f52031a;
    public final String f52032b;

    public d0(String str, String str2) {
        this.f52031a = str;
        this.f52032b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f52031a.equals(d0Var.f52031a) && this.f52032b.equals(d0Var.f52032b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52031a.hashCode() ^ 1000003) * 1000003) ^ this.f52032b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f52031a);
        sb2.append(", value=");
        return a1.g.t(sb2, this.f52032b, "}");
    }
}
