package z9;
public final class d0 extends h1 {
    public final String f49956a;
    public final String f49957b;

    public d0(String str, String str2) {
        this.f49956a = str;
        this.f49957b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f49956a.equals(d0Var.f49956a) && this.f49957b.equals(d0Var.f49957b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49956a.hashCode() ^ 1000003) * 1000003) ^ this.f49957b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f49956a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f49957b, "}");
    }
}
