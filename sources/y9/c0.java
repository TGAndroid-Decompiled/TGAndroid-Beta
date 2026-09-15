package y9;
public final class c0 extends f1 {
    public final String f46480a;
    public final String f46481b;
    public final String f46482c;

    public c0(String str, String str2, String str3) {
        this.f46480a = str;
        this.f46481b = str2;
        this.f46482c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46480a.equals(c0Var.f46480a) && this.f46481b.equals(c0Var.f46481b) && this.f46482c.equals(c0Var.f46482c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46480a.hashCode() ^ 1000003) * 1000003) ^ this.f46481b.hashCode()) * 1000003) ^ this.f46482c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46480a);
        sb2.append(", libraryName=");
        sb2.append(this.f46481b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46482c, "}");
    }
}
