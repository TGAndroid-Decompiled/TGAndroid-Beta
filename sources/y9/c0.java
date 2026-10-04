package y9;
public final class c0 extends f1 {
    public final String f50604a;
    public final String f50605b;
    public final String f50606c;

    public c0(String str, String str2, String str3) {
        this.f50604a = str;
        this.f50605b = str2;
        this.f50606c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f50604a.equals(c0Var.f50604a) && this.f50605b.equals(c0Var.f50605b) && this.f50606c.equals(c0Var.f50606c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50604a.hashCode() ^ 1000003) * 1000003) ^ this.f50605b.hashCode()) * 1000003) ^ this.f50606c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f50604a);
        sb2.append(", libraryName=");
        sb2.append(this.f50605b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f50606c, "}");
    }
}
