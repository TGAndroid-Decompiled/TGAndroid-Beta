package y9;
public final class d0 extends h1 {
    public final String f49761a;
    public final String f49762b;

    public d0(String str, String str2) {
        this.f49761a = str;
        this.f49762b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f49761a.equals(d0Var.f49761a) && this.f49762b.equals(d0Var.f49762b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49761a.hashCode() ^ 1000003) * 1000003) ^ this.f49762b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f49761a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f49762b, "}");
    }
}
