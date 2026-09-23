package y9;
public final class d0 extends h1 {
    public final String f46450a;
    public final String f46451b;

    public d0(String str, String str2) {
        this.f46450a = str;
        this.f46451b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46450a.equals(d0Var.f46450a) && this.f46451b.equals(d0Var.f46451b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46450a.hashCode() ^ 1000003) * 1000003) ^ this.f46451b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46450a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f46451b, "}");
    }
}
