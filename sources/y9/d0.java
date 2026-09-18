package y9;
public final class d0 extends h1 {
    public final String f46524a;
    public final String f46525b;

    public d0(String str, String str2) {
        this.f46524a = str;
        this.f46525b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46524a.equals(d0Var.f46524a) && this.f46525b.equals(d0Var.f46525b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46524a.hashCode() ^ 1000003) * 1000003) ^ this.f46525b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46524a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f46525b, "}");
    }
}
