package y9;
public final class d0 extends h1 {
    public final String f46519a;
    public final String f46520b;

    public d0(String str, String str2) {
        this.f46519a = str;
        this.f46520b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46519a.equals(d0Var.f46519a) && this.f46520b.equals(d0Var.f46520b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46519a.hashCode() ^ 1000003) * 1000003) ^ this.f46520b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46519a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f46520b, "}");
    }
}
