package z9;
public final class d0 extends h1 {
    public final String f51340a;
    public final String f51341b;

    public d0(String str, String str2) {
        this.f51340a = str;
        this.f51341b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f51340a.equals(d0Var.f51340a) && this.f51341b.equals(d0Var.f51341b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51340a.hashCode() ^ 1000003) * 1000003) ^ this.f51341b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f51340a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f51341b, "}");
    }
}
