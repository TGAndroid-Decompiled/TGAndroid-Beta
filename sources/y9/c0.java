package y9;
public final class c0 extends f1 {
    public final String f52124a;
    public final String f52125b;
    public final String f52126c;

    public c0(String str, String str2, String str3) {
        this.f52124a = str;
        this.f52125b = str2;
        this.f52126c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f52124a.equals(c0Var.f52124a) && this.f52125b.equals(c0Var.f52125b) && this.f52126c.equals(c0Var.f52126c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52124a.hashCode() ^ 1000003) * 1000003) ^ this.f52125b.hashCode()) * 1000003) ^ this.f52126c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f52124a);
        sb2.append(", libraryName=");
        sb2.append(this.f52125b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f52126c, "}");
    }
}
