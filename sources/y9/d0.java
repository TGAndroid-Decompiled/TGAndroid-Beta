package y9;
public final class d0 extends h1 {
    public final String f46819a;
    public final String f46820b;

    public d0(String str, String str2) {
        this.f46819a = str;
        this.f46820b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46819a.equals(d0Var.f46819a) && this.f46820b.equals(d0Var.f46820b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46819a.hashCode() ^ 1000003) * 1000003) ^ this.f46820b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46819a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f46820b, "}");
    }
}
