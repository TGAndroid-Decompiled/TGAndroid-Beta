package y9;
public final class c0 extends f1 {
    public final String f46434a;
    public final String f46435b;
    public final String f46436c;

    public c0(String str, String str2, String str3) {
        this.f46434a = str;
        this.f46435b = str2;
        this.f46436c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46434a.equals(c0Var.f46434a) && this.f46435b.equals(c0Var.f46435b) && this.f46436c.equals(c0Var.f46436c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46434a.hashCode() ^ 1000003) * 1000003) ^ this.f46435b.hashCode()) * 1000003) ^ this.f46436c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46434a);
        sb2.append(", libraryName=");
        sb2.append(this.f46435b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46436c, "}");
    }
}
