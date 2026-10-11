package y9;
public final class d0 extends h1 {
    public final String f51997a;
    public final String f51998b;

    public d0(String str, String str2) {
        this.f51997a = str;
        this.f51998b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f51997a.equals(d0Var.f51997a) && this.f51998b.equals(d0Var.f51998b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51997a.hashCode() ^ 1000003) * 1000003) ^ this.f51998b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f51997a);
        sb2.append(", value=");
        return a1.g.t(sb2, this.f51998b, "}");
    }
}
