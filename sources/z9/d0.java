package z9;
public final class d0 extends h1 {
    public final String f51350a;
    public final String f51351b;

    public d0(String str, String str2) {
        this.f51350a = str;
        this.f51351b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f51350a.equals(d0Var.f51350a) && this.f51351b.equals(d0Var.f51351b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51350a.hashCode() ^ 1000003) * 1000003) ^ this.f51351b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f51350a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f51351b, "}");
    }
}
