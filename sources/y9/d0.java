package y9;
public final class d0 extends h1 {
    public final String f46777a;
    public final String f46778b;

    public d0(String str, String str2) {
        this.f46777a = str;
        this.f46778b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46777a.equals(d0Var.f46777a) && this.f46778b.equals(d0Var.f46778b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46777a.hashCode() ^ 1000003) * 1000003) ^ this.f46778b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46777a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f46778b, "}");
    }
}
