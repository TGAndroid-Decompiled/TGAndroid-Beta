package y9;
public final class d0 extends h1 {
    public final String f46646a;
    public final String f46647b;

    public d0(String str, String str2) {
        this.f46646a = str;
        this.f46647b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46646a.equals(d0Var.f46646a) && this.f46647b.equals(d0Var.f46647b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46646a.hashCode() ^ 1000003) * 1000003) ^ this.f46647b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46646a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f46647b, "}");
    }
}
