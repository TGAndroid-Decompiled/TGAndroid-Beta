package z9;
public final class d0 extends h1 {
    public final String f55259a;
    public final String f55260b;

    public d0(String str, String str2) {
        this.f55259a = str;
        this.f55260b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f55259a.equals(d0Var.f55259a) && this.f55260b.equals(d0Var.f55260b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55259a.hashCode() ^ 1000003) * 1000003) ^ this.f55260b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f55259a);
        sb2.append(", value=");
        return a1.g.r(sb2, this.f55260b, "}");
    }
}
