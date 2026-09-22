package y9;
public final class d0 extends h1 {
    public final String f46492a;
    public final String f46493b;

    public d0(String str, String str2) {
        this.f46492a = str;
        this.f46493b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f46492a.equals(d0Var.f46492a) && this.f46493b.equals(d0Var.f46493b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46492a.hashCode() ^ 1000003) * 1000003) ^ this.f46493b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f46492a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f46493b, "}");
    }
}
