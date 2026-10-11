package y9;
public final class c0 extends f1 {
    public final String f51979a;
    public final String f51980b;
    public final String f51981c;

    public c0(String str, String str2, String str3) {
        this.f51979a = str;
        this.f51980b = str2;
        this.f51981c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51979a.equals(c0Var.f51979a) && this.f51980b.equals(c0Var.f51980b) && this.f51981c.equals(c0Var.f51981c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51979a.hashCode() ^ 1000003) * 1000003) ^ this.f51980b.hashCode()) * 1000003) ^ this.f51981c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51979a);
        sb2.append(", libraryName=");
        sb2.append(this.f51980b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f51981c, "}");
    }
}
