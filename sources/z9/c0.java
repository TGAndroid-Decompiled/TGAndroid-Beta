package z9;
public final class c0 extends f1 {
    public final String f51346a;
    public final String f51347b;
    public final String f51348c;

    public c0(String str, String str2, String str3) {
        this.f51346a = str;
        this.f51347b = str2;
        this.f51348c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51346a.equals(c0Var.f51346a) && this.f51347b.equals(c0Var.f51347b) && this.f51348c.equals(c0Var.f51348c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51346a.hashCode() ^ 1000003) * 1000003) ^ this.f51347b.hashCode()) * 1000003) ^ this.f51348c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51346a);
        sb2.append(", libraryName=");
        sb2.append(this.f51347b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51348c, "}");
    }
}
