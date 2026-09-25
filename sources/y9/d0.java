package y9;
public final class d0 extends h1 {
    public final String f46776a;
    public final String f46777b;

    public d0(String str, String str2) {
        this.f46776a = str;
        this.f46777b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46776a.equals(d0Var.f46776a) && this.f46777b.equals(d0Var.f46777b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46776a.hashCode() ^ 1000003) * 1000003) ^ this.f46777b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46776a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f46777b, "}");
    }
}
