package y9;
public final class c0 extends f1 {
    public final String f51890a;
    public final String f51891b;
    public final String f51892c;

    public c0(String str, String str2, String str3) {
        this.f51890a = str;
        this.f51891b = str2;
        this.f51892c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51890a.equals(c0Var.f51890a) && this.f51891b.equals(c0Var.f51891b) && this.f51892c.equals(c0Var.f51892c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51890a.hashCode() ^ 1000003) * 1000003) ^ this.f51891b.hashCode()) * 1000003) ^ this.f51892c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51890a);
        sb2.append(", libraryName=");
        sb2.append(this.f51891b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f51892c, "}");
    }
}
