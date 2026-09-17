package y9;
public final class d0 extends h1 {
    public final String f49733a;
    public final String f49734b;

    public d0(String str, String str2) {
        this.f49733a = str;
        this.f49734b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f49733a.equals(d0Var.f49733a) && this.f49734b.equals(d0Var.f49734b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49733a.hashCode() ^ 1000003) * 1000003) ^ this.f49734b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f49733a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f49734b, "}");
    }
}
