package y9;
public final class d0 extends h1 {
    public final String f52142a;
    public final String f52143b;

    public d0(String str, String str2) {
        this.f52142a = str;
        this.f52143b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f52142a.equals(d0Var.f52142a) && this.f52143b.equals(d0Var.f52143b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52142a.hashCode() ^ 1000003) * 1000003) ^ this.f52143b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f52142a);
        sb2.append(", value=");
        return a1.g.t(sb2, this.f52143b, "}");
    }
}
