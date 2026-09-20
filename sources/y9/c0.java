package y9;
public final class c0 extends f1 {
    public final String f46782a;
    public final String f46783b;
    public final String f46784c;

    public c0(String str, String str2, String str3) {
        this.f46782a = str;
        this.f46783b = str2;
        this.f46784c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46782a.equals(c0Var.f46782a) && this.f46783b.equals(c0Var.f46783b) && this.f46784c.equals(c0Var.f46784c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46782a.hashCode() ^ 1000003) * 1000003) ^ this.f46783b.hashCode()) * 1000003) ^ this.f46784c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46782a);
        sb2.append(", libraryName=");
        sb2.append(this.f46783b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46784c, "}");
    }
}
