package z9;
public final class d0 extends h1 {
    public final String f51351a;
    public final String f51352b;

    public d0(String str, String str2) {
        this.f51351a = str;
        this.f51352b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f51351a.equals(d0Var.f51351a) && this.f51352b.equals(d0Var.f51352b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51351a.hashCode() ^ 1000003) * 1000003) ^ this.f51352b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f51351a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f51352b, "}");
    }
}
