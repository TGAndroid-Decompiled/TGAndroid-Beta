package y9;
public final class d0 extends h1 {
    public final String f50629a;
    public final String f50630b;

    public d0(String str, String str2) {
        this.f50629a = str;
        this.f50630b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f50629a.equals(d0Var.f50629a) && this.f50630b.equals(d0Var.f50630b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50629a.hashCode() ^ 1000003) * 1000003) ^ this.f50630b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f50629a);
        sb2.append(", value=");
        return a4.a.t(sb2, this.f50630b, "}");
    }
}
