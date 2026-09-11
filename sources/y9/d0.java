package y9;
public final class d0 extends h1 {
    public final String f49732a;
    public final String f49733b;

    public d0(String str, String str2) {
        this.f49732a = str;
        this.f49733b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f49732a.equals(d0Var.f49732a) && this.f49733b.equals(d0Var.f49733b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49732a.hashCode() ^ 1000003) * 1000003) ^ this.f49733b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f49732a);
        sb2.append(", value=");
        return a4.a.s(sb2, this.f49733b, "}");
    }
}
