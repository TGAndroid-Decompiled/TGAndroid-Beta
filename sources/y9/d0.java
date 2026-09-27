package y9;
public final class d0 extends h1 {
    public final String f46820a;
    public final String f46821b;

    public d0(String str, String str2) {
        this.f46820a = str;
        this.f46821b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46820a.equals(d0Var.f46820a) && this.f46821b.equals(d0Var.f46821b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46820a.hashCode() ^ 1000003) * 1000003) ^ this.f46821b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46820a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f46821b, "}");
    }
}
