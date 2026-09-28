package y9;
public final class c0 extends f1 {
    public final String f46760a;
    public final String f46761b;
    public final String f46762c;

    public c0(String str, String str2, String str3) {
        this.f46760a = str;
        this.f46761b = str2;
        this.f46762c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46760a.equals(c0Var.f46760a) && this.f46761b.equals(c0Var.f46761b) && this.f46762c.equals(c0Var.f46762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46760a.hashCode() ^ 1000003) * 1000003) ^ this.f46761b.hashCode()) * 1000003) ^ this.f46762c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46760a);
        sb2.append(", libraryName=");
        sb2.append(this.f46761b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46762c, "}");
    }
}
