package y9;
public final class c0 extends f1 {
    public final String f52116a;
    public final String f52117b;
    public final String f52118c;

    public c0(String str, String str2, String str3) {
        this.f52116a = str;
        this.f52117b = str2;
        this.f52118c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f52116a.equals(c0Var.f52116a) && this.f52117b.equals(c0Var.f52117b) && this.f52118c.equals(c0Var.f52118c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52116a.hashCode() ^ 1000003) * 1000003) ^ this.f52117b.hashCode()) * 1000003) ^ this.f52118c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f52116a);
        sb2.append(", libraryName=");
        sb2.append(this.f52117b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f52118c, "}");
    }
}
