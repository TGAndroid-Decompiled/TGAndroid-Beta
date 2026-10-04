package y9;
public final class d0 extends h1 {
    public final String f50622a;
    public final String f50623b;

    public d0(String str, String str2) {
        this.f50622a = str;
        this.f50623b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f50622a.equals(d0Var.f50622a) && this.f50623b.equals(d0Var.f50623b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50622a.hashCode() ^ 1000003) * 1000003) ^ this.f50623b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f50622a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f50623b, "}");
    }
}
