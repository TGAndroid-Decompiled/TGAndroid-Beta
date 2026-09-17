package y9;
public final class d0 extends h1 {
    public final String f49762a;
    public final String f49763b;

    public d0(String str, String str2) {
        this.f49762a = str;
        this.f49763b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f49762a.equals(d0Var.f49762a) && this.f49763b.equals(d0Var.f49763b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49762a.hashCode() ^ 1000003) * 1000003) ^ this.f49763b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f49762a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f49763b, "}");
    }
}
