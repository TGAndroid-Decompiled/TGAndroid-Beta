package y9;
public final class c0 extends f1 {
    public final String f46867a;
    public final String f46868b;
    public final String f46869c;

    public c0(String str, String str2, String str3) {
        this.f46867a = str;
        this.f46868b = str2;
        this.f46869c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46867a.equals(c0Var.f46867a) && this.f46868b.equals(c0Var.f46868b) && this.f46869c.equals(c0Var.f46869c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46867a.hashCode() ^ 1000003) * 1000003) ^ this.f46868b.hashCode()) * 1000003) ^ this.f46869c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46867a);
        sb2.append(", libraryName=");
        sb2.append(this.f46868b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46869c, "}");
    }
}
